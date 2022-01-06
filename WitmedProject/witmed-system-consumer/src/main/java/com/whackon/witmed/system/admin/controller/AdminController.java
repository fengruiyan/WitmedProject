package com.whackon.witmed.system.admin.controller;

import cn.hutool.crypto.digest.MD5;
import com.whackon.witmed.base.controller.BaseController;
import com.whackon.witmed.base.pojo.enums.Status;
import com.whackon.witmed.base.pojo.vo.ResponseVO;
import com.whackon.witmed.base.util.BaseConstants;
import com.whackon.witmed.base.util.RedisUtil;
import com.whackon.witmed.base.util.TokenUtil;
import com.whackon.witmed.system.admin.pojo.vo.AdminLoginVO;
import com.whackon.witmed.system.admin.pojo.vo.AdminVO;
import com.whackon.witmed.system.admin.transport.AdminTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * <b>系统功能 - 系统用户控制层</b>
 * @author
 * @date 2022/1/6
 * @version 1.0.0
 * @since 1.0.0
 */
@RestController("adminController")
@RequestMapping("/system/admin/admin")
public class AdminController extends BaseController {
	@Autowired
	private AdminTransport adminTransport;
	@Autowired
	private RedisUtil redisUtil;
	/**
	 * <b>用户使用登录视图进行用户登录</b>
	 * @param adminLoginVO
	 * @return
	 * @throws Exception
	 */
	public ResponseVO loginAdmin(@RequestBody@Validated AdminLoginVO adminLoginVO, BindingResult result) throws Exception{
		//判断错误对象信息 BindingResult 中是否还有错误信息
		if (result.hasErrors()) {
			return ResponseVO.error("请填写正确的手机号码和登录密码");
		}
		//用户信息校验成功，根据手机号码查询用户信息
		AdminVO adminVO = adminTransport.getAdminVOByCellphone(adminLoginVO.getCellphone());
		//判断所得到的用户信息是否存在
		if (adminVO == null) {
			//判断所得到的用户信息不存在
			return  ResponseVO.error("该用户不存在");
		}
		//如果存在，判断用户状态是否为启用状态
		if (Status.STATUS_DISABLE.getCode().equals(adminVO.getStatus())) {
			//此时用户状态为禁用状态
			return ResponseVO.error("该用户禁止登录系统");
		}
		//用户处于启用状态，则对该用户登录密码进行加密，并判断密码是否相同
		String password = MD5.create().digestHex(adminLoginVO.getPassword());
		if (adminVO.getPassword().equals(password)) {
			//此时用户密码错误
			return ResponseVO.error("手机号码或登录密码错误");
		}
		//用户登录成功，使用工具类生成系统唯一的令牌（Token）
		Map<String,String> claimMap = new HashMap<String,String>();
		claimMap.put("id", adminVO.getId());
		String token = TokenUtil.createToken(claimMap, BaseConstants.EXPIRE_AUTH_SEC);
		//以Token作为Key，以用户对象作为Value 存储到Redis中
		if (redisUtil.saveToRedis(token, adminVO, BaseConstants.EXPIRE_AUTH_SEC)) {
			//存储成功，将Token 返回给用户
			//将Token交给用户存储，可以将Token绑定到HTTP响应对象的消息头部分Authorization
			response.setHeader("Authorization", token);
			//返回前段登录成功结果
			return ResponseVO.success("系统用户登录成功", adminVO);
		}
		return ResponseVO.error("系统登录失败");
	}
}
