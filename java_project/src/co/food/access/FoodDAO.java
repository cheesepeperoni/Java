package co.food.access;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import co.food.model.Food;

public class FoodDAO implements FoodAccess {
	static PreparedStatement psmt;
	static ResultSet rs;
	static Connection conn;

	private void connect() {
		String url = "jdbc:sqlite:C:/sqlite/db/sample.db";
		try {
			conn = DriverManager.getConnection(url);
			System.out.println("연결성공!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void close() {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (psmt != null) {
			try {
				psmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	// 음식재료, 내용, 유효기간 입력하기
	@Override
	public void insert(Food food) {
		connect();
		String sql = "insert into food(food,content,date) values(?,?,?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, food.getFood());
			psmt.setString(2, food.getContent());
			psmt.setString(3, food.getDate());
			psmt.executeUpdate();
			System.out.println("<< 입력되었습니다 >>");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

	}

	// 등록번호 받아서 음식재료, 내용, 유효기간 수정하기
	@Override
	public void update(Food food) {
		connect();
		String sql = "update food set food =?,content=?,date=? where number=?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, food.getFood());
			psmt.setString(2, food.getContent());
			psmt.setString(3, food.getDate());
			psmt.setInt(4, food.getNumber());
			psmt.executeUpdate();
			System.out.println("<< 수정되었습니다 >>");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

	}

	// 등록번호 받아서 지우기
	@Override
	public void delete(int number) {
		connect();
		String sql = "delete from food where number=?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, number);
			psmt.executeUpdate();
			System.out.println("<< 삭제되었습니다 >>");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

	}

	@Override
	public ArrayList<Food> foodAll() {
		connect();
		ArrayList<Food> fList = new ArrayList<>();
		String sql = "select * from food";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				Food food = new Food();
				food.setNumber(rs.getInt("number"));
				food.setFood(rs.getString("food"));
				food.setContent(rs.getString("content"));
				food.setDate(rs.getString("date"));
				fList.add(food);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return fList;
	}

	@Override
	public Food foodOne(String food) {
		connect();
		String sql = "select * from food where food=?";
		Food f = null;
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, food);
			rs = psmt.executeQuery();
			if (rs.next()) {
				f = new Food();
				f.setNumber(rs.getInt("number"));
				f.setFood(rs.getString("food"));
				f.setContent(rs.getString("content"));
				f.setDate(rs.getString("date"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return f;
	}

	// 로그인
	@Override
	public boolean login(String loginId, String loginPw) {
		connect();
		boolean log = false;
		String sql = "select * from foodUser where id=? and passwd=?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, loginId);
			psmt.setString(2, loginPw);
			rs = psmt.executeQuery();
			if (rs.next()) {
				log = true;
				System.out.println("<< 로그인 되었습니다 >>");
			} else {
				log = false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return log;
	}

	// 직원 회원가입
	@Override
	public void signUp(String h, String hp) {
		connect();
		String sql = "insert into foodUser values(?,?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, h);
			psmt.setString(2, hp);
			psmt.executeUpdate();
			System.out.println("<< 회원가입이 완료되었습니다 >>");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

	}

	// 회원탈퇴
	@Override
	public boolean unSubscribe(String byeId, String byePw) {
		connect();
		boolean b = false;
		String sql = "delete from foodUser where id=? and passwd=?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, byeId);
			psmt.setString(2, byePw);
			rs = psmt.executeQuery();
			if (rs.next()) {
				b = true;
				System.out.println("<< 탈퇴되었습니다 수고하셨습니다 >>");
			} else {
				b = false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return b;
	}

}