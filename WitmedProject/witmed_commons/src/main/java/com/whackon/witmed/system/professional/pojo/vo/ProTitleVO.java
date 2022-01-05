package com.whackon.witmed.system.professional.pojo.vo;

import com.whackon.witmed.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * <b>系统功能 - 专业职务视图信息</b>
 * @author
 * @date 2021/12/29
 * @version 1.0.0
 * @since 1.0.0
 */
@Data
public class ProTitleVO extends BaseVO {
	private static final long serialVersionUID = -6233871189769297005L;
	private Integer id;                             //主键
	private String category;                        //所属类别
	private String rank;                            //所属等级
	private String code;                            //专业职务编码
	private String name;                            //专业职务名称

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
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
