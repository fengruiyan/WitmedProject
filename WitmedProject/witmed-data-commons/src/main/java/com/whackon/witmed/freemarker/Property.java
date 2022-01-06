package com.whackon.witmed.freemarker;

/**
 * <b></b>
 *
 * @author Arthur
 * @date 2022/1/5
 * @since
 */
public class Property {
	private String type;                        // 数据类型
	private String name;                        // 属性名
	private String comment;                     // 注释

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
}
