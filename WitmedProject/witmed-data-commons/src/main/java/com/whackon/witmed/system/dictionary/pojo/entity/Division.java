package com.whackon.witmed.system.dictionary.pojo.entity;

import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>系统功能 - 行政区划实体信息</b>
 * @author
 * @date 2022/1/4
 * @version 1.0.0
 * @since 1.0.0
 */
@Data
public class Division extends BaseEntity {
	private static final long serialVersionUID = 3945728722993461962L;
	private Integer id;                             //主键
	private Division parent;                        //上级行政区划
	private String code;                            //区划编码
	private String name;                            //区划名称

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Division getParent() {
		return parent;
	}

	public void setParent(Division parent) {
		this.parent = parent;
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
