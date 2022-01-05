package com.whackon.witmed.system.dictionary.pojo.vo;

import com.whackon.witmed.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * <b>系统功能 - 行政区划视图信息</b>
 * @author
 * @date 2021/12/29
 * @version 1.0.0
 * @since 1.0.0
 */
@Data
public class DivisionVO extends BaseVO {
	private static final long serialVersionUID = 3945728722993461962L;
	private Integer id;                             //主键
	private DivisionVO parent;                        //上级行政区划
	private String code;                            //区划编码
	private String name;                            //区划名称

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public DivisionVO getParent() {
		return parent;
	}

	public void setParent(DivisionVO parent) {
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
