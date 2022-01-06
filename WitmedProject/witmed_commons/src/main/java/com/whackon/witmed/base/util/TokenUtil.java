package com.whackon.witmed.base.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <b>Token 工具类</b>
 * @author
 * @date 2022/1/6
 * @version 1.0.0
 * @since 1.0.0
 *
 */
public class TokenUtil {
	//设定系统加密算法
	private static Algorithm algorithm = Algorithm.HMAC256(BaseConstants.SECRET_KEY);

	/**
	 * <b>根据用户所给定的信息生成Token</b>
	 * @return
	 */
	public static String createToken(Map<String,String> claimMap,Long expireSec) {
		//创建JWT Token 生成器
		JWTCreator.Builder builder = JWT.create();
		//创建Map 集合， 用于设定生成Token的头部信息
		Map<String,Object> headerMap = new HashMap<String,Object>();
		//设定Token 的生成方式是使用了 jwt
		headerMap.put("typ", "jwt");
		//设定整体 Token的加密算法
		headerMap.put("alg", "HS256");
		//设定头部信息
		builder.withHeader(headerMap);
		//设定Token的有效载荷部分
		//取出所给定的Map 集合中的每一个key-value 组合，逐一加载
		//循环Map集合，在JDK 8 使用foreach()快速实现循环
		claimMap.forEach((Key, value) ->{
			builder.withClaim(Key, value);
		});
		//设置Token的有效时间，获取Token到期的时间Date
		builder.withExpiresAt(new Date(System.currentTimeMillis() + expireSec*1000));
		return builder.sign(algorithm);
	}
	/**
	 * <b>校验Token信息，获得该Token 中的有效载荷数据</b>
	 * @param token
	 * @return
	 */
	public static Map<String,String> verifyToken(String token) {
		//校验所给定的 Token符合相关形式
		if (token != null && !"".equals(token.trim())) {
			//此时Token 格式有效
			//获得 Token 校验对象 JWTVerifier
			JWTVerifier verifier = JWT.require(algorithm).build();
			//对于 Token 进行校验
			DecodedJWT decodedJWT = verifier.verify(token);
			//能获得 DecodedJWT 则说明通过秘钥能够家加密Token进行解密
			//提取绑定在Token中的有效载荷信息
			Map<String,String> resultMap = new HashMap<String,String>();
			Map<String, Claim> claimMap = decodedJWT.getClaims();
			claimMap.forEach((Key,value) -> {
				resultMap.put(Key,value.asString());
			});
			return resultMap;
		}
		return null;
	}
}
