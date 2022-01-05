package com.whackon.witmed.system.hospital.pojo.entity;

import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>系统功能 - 医院实体信息</b>
 * @author
 * @date 2022/1/4
 * @version 1.0.0
 * @since 1.0.0
 */
@Data
public class Hospital extends BaseEntity {
	private static final long serialVersionUID = -7418587273850317256L;
	private Integer id;                             //主键
	private String name;                            //机构名称
	private String authority;                       //上级主管机构名称
	private String orgCode;                         //机构组织机构代码
	private String charge;                          //机构负责人（法人）
	private String addressCatCode;                  //标识地址类别的代码
	private String province;                        //所在省份
	private String city;                            //所在市
	private String country;                         //所在区县
	private String town;                            //地址-乡（镇、街道办事处）
	private String village;                         //地址-村（街、路、弄等）
	private String doorNo;                          //地址-门牌号码
	private String zipCode;                         //邮政编码
	private String divisionCode;                    //行政区划代码
	private String cellphoneCat;                    //联系电话-类别信息
	private String cellphone;                       //联系电话-号码
	private String email;                           //电子邮箱地址

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public String getOrgCode() {
		return orgCode;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	public String getCharge() {
		return charge;
	}

	public void setCharge(String charge) {
		this.charge = charge;
	}

	public String getAddressCatCode() {
		return addressCatCode;
	}

	public void setAddressCatCode(String addressCatCode) {
		this.addressCatCode = addressCatCode;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public String getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getDivisionCode() {
		return divisionCode;
	}

	public void setDivisionCode(String divisionCode) {
		this.divisionCode = divisionCode;
	}

	public String getCellphoneCat() {
		return cellphoneCat;
	}

	public void setCellphoneCat(String cellphoneCat) {
		this.cellphoneCat = cellphoneCat;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
