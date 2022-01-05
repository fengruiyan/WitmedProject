package com.whackon.witmed.system.hospital.pojo;
import com.whackon.witmed.base.pojo.vo.BaseVO;
import com.whackon.witmed.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * <b>系统功能 - 医院部门视图信息</b>
 * @author
 * @date 2021/12/29
 * @version 1.0.0
 * @since 1.0.0
 */
@Data
public class DepartmentVO extends BaseVO {
	private static final long serialVersionUID = -5793475151487271519L;
	private Integer id;                             //主键
	private HospitalVO hospital;                      //所属医院
	private DepartmentVO parent;                      //上级部门
	private String code;                            //部门编码
	private String name;                            //部门名称

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public HospitalVO getHospital() {
		return hospital;
	}

	public void setHospital(HospitalVO hospital) {
		this.hospital = hospital;
	}

	public DepartmentVO getParent() {
		return parent;
	}

	public void setParent(DepartmentVO parent) {
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
