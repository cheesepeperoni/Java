package co.friend.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {
	public Connection conn;
	//protected 상속관계에 있어서는 쓸 수 있음
	protected DAO() {
		String url = "jdbc:sqlite:C:/sqlite/db/sample.db";
		try {
			conn = DriverManager.getConnection(url);
			System.out.println("DAO _ 연결성공!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
