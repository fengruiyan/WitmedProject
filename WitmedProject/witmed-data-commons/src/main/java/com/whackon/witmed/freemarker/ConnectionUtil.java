package com.whackon.witmed.freemarker;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * <b></b>
 *
 * @author Arthur
 * @date 2022/1/5
 * @since
 */
public class ConnectionUtil {
	private static String driverName = "com.mysql.cj.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost:3306/witmed_db?useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai&useSSL=false&allowPublicKeyRetrieval=true";
	private static String username = "root";
	private static String password = "root";
	private static ThreadLocal<Connection> threadLocal = new ThreadLocal<Connection>();

	static {
		try {
			Class.forName(driverName);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		Connection connection = threadLocal.get();
		if (connection == null) {
			try {
				connection = DriverManager.getConnection(url, username, password);
				threadLocal.set(connection);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return connection;
	}
}
