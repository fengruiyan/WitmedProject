package com.whackon.witmed.system.dictionary.pojo.entity;

import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>系统功能 - 数据元值域代码实体信息</b>
 * @author
 * @date 2022/1/4
 * @version 1.0.0
 * @since 1.0.0
 */
@Data
public class DataCode extends BaseEntity {
	private static final long serialVersionUID = 77283056160711451L;
	private Long id;                          //主键
	private DataCode parent;                     //上级数据元
	private String codeName;                     //数据元值
	private String name;                         //数据元值说明

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public DataCode getParent() {
		return parent;
	}

	public void setParent(DataCode parent) {
		this.parent = parent;
	}

	public String getCodeName() {
		return codeName;
	}

	public void setCodeName(String codeName) {
		this.codeName = codeName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
