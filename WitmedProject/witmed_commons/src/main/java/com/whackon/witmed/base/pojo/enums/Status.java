package com.whackon.witmed.base.pojo.enums;

/**
 * <b>系统状态枚举信息</b>
 *
 * @author Arthur
 * @date
 * @since 1.0.0
 * @version 1.0.0
 */
public enum Status {
	STATUS_ENABLE("1", "启用"),
	STATUS_DISABLE("0", "禁用");

	private String code;                        // 系统状态编码
	private String remark;                      // 系统状态编码说明

	private Status(String code, String remark) {
		this.code = code;
		this.remark = remark;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}
