package com.whackon.witmed.system.position.pojo.vo;

import com.whackon.witmed.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * <b>系统功能 - 人员职务视图信息</b>
 * @author
 * @date 2021/12/29
 * @version 1.0.0
 * @since 1.0.0
 */
@Data
public class PositionVO extends BaseVO {
	private static final long serialVersionUID = 2453178190528955472L;
	private Integer id;                         //主键
	private String code;                        //职务编号
	private String name;                        //职务名称

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
