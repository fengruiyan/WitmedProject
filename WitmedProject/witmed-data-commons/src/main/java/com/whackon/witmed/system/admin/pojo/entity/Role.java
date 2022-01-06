package com.whackon.witmed.system.admin.pojo.entity;

import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
* <b>系统功能 - 系统用户实体信息</b>
 * @author Arthur
 * @date 2022/1/5
 * @version 1.0.0
 * @since 1.0.0
*/
@Data
public class Role extends BaseEntity {
	private Long id;                        // 主键
	private String code;                        // 角色编码
	private String name;                        // 角色名称
	private String status;                        // 系统状态：0-禁用，1-启用
	private String createdBy;                        // 创建人
	private Date createdTime;                        // 创建时间
	private String modifiedBy;                        // 修改人
	private Date modifiedTime;                        // 修改时间
}