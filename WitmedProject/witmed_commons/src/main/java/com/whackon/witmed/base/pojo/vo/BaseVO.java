package com.whackon.witmed.base.pojo.vo;



import java.io.Serializable;
import java.util.Date;

/**
 * <b>基础视图类</b>
 *
 * @author Arthur
 * @date
 * @since 1.0.0
 * @version 1.0.0
 */
public class BaseVO implements Serializable {
	private static final long serialVersionUID = 5307507834353921384L;
	private String status;            //系统状态： 0-禁用  1- 启用
	private String createBy;          //创建人
	private Date createTime;          //创建时间
	private String modifiedBy;        //修改人
	private Date modifiedTime;        //修改时间

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getModifiedTime() {
		return modifiedTime;
	}

	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}
}
