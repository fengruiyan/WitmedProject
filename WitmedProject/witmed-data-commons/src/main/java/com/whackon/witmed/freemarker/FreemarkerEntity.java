package com.whackon.witmed.freemarker;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * <b></b>
 *
 * @author Arthur
 * @date 2022/1/5
 * @since
 */
public class FreemarkerEntity {
	public static void main(String[] args) {
		// 获得数据库连接对象
		Connection connection = ConnectionUtil.getConnection();
		// 设定需要执行的 SQL
		String sql = "select column_name, data_type, column_comment " +
				"from information_schema.columns where table_schema='witmed_db'" +
				" and table_name='sys_role' order by ordinal_position asc";
		try {
			// 创建 PreparedStatement
			PreparedStatement ps = connection.prepareStatement(sql);
			// 进行执行
			ResultSet resultSet = ps.executeQuery();
			// 循环结果集，创建 Property 类型的集合
			List<Property> propertyList = new ArrayList<Property>();
			while (resultSet.next()) {
				// 提取数据
				String type = resultSet.getString("data_type");
				String name = resultSet.getString("column_name");
				String comment = resultSet.getString("column_comment");
				// 将数据库的数据类型变为 Java 的数据类型
				if ("int".equalsIgnoreCase(type)) {
					type = "Long";
				} else if ("varchar".equalsIgnoreCase(type)) {
					type = "String";
				} else if ("timestamp".equals(type)) {
					type = "Date";
				}

				// 创建 Property 对象
				Property property = new Property();
				property.setType(type);
				property.setName(name);
				property.setComment(comment);

				propertyList.add(property);
			}

			Entity entity = new Entity();
			entity.setPackageName("com.whackon.witmed.system.admin.pojo.entity");
			entity.setClassName("Role");
			entity.setPropertyList(propertyList);

			// 调用 Freemarker 工具类生成实体类
			if (FreemarkerUtil.createEntity(entity)) {
				System.out.println("目标文件生成成功");
			} else {
				System.out.println("目标文件生成失败");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
