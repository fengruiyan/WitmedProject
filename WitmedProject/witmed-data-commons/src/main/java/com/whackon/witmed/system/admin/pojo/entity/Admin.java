package com.whackon.witmed.system.admin.pojo.entity;

import com.whackon.witmed.base.pojo.entity.BaseEntity;
import com.whackon.witmed.system.hospital.pojo.entity.Department;
import lombok.Data;

/**
 * <b>系统功能 - 系统用户实体信息</b>
 * @author
 * @date 2022/1/4
 * @version 1.0.0
 * @since 1.0.0
 *
 */
@Data
public class Admin extends BaseEntity {
	private static final long serialVersionUID = 4226492550883944160L;
	private String id;          //主键
	private String no;          //人员工号
	private String name;        //人员姓名
	private String cellphone;   //联系电话
	private String password;    //登陆密码
	private String role;        //人员角色
	private String identity;    //人员身份
	private String department;  //所属部门
	private String techPos;     //服务者专业技术职务（职称）
	private String education;   //服务者学历
	private String techPosRank; //服务者所学专业

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getIdentity() {
		return identity;
	}

	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getTechPos() {
		return techPos;
	}

	public void setTechPos(String techPos) {
		this.techPos = techPos;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getTechPosRank() {
		return techPosRank;
	}

	public void setTechPosRank(String techPosRank) {
		this.techPosRank = techPosRank;
	}
}
