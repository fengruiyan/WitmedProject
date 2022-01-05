package com.whackon.witmed.system.hospital.pojo.entity;

import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>系统功能 - 医院部门实体信息</b>
 * @author
 * @date 2022/1/4
 * @version 1.0.0
 * @since 1.0.0
 */
@Data
public class Department extends BaseEntity {
	private static final long serialVersionUID = -5793475151487271519L;
	private Integer id;                             //主键
	private Hospital hospital;                      //所属医院
	private Department parent;                      //上级部门
	private String code;                            //部门编码
	private String name;                            //部门名称

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Hospital getHospital() {
		return hospital;
	}

	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}

	public Department getParent() {
		return parent;
	}

	public void setParent(Department parent) {
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
