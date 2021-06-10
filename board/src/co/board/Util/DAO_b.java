package co.board.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO_b {
	public Connection conn;
	//protected 상속관계에 있어서는 쓸 수 있음
	protected DAO_b() {
		String url = "jdbc:sqlite:C:/sqlite/db/sample.db";
		try {
			conn = DriverManager.getConnection(url);
			System.out.println("♥연결성공♥");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
