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

	// 전체조회
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
	public ArrayList<Food> workerAll() {
		connect();
		ArrayList<Food> wList = new ArrayList<>();
		String sql = "select * from foodUser";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				Food work = new Food();
				work.setLoginId(rs.getString("id"));
				wList.add(work);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return wList;
	}

	// 재료로 조회
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
	public boolean deleteAccount(String byeId, String byePw) {
		connect();
		boolean b = false;
		String sql = "delete from foodUser where id =? and passwd=?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, byeId);
			psmt.setString(2, byePw);
			psmt.executeUpdate();
			if (rs.next()) {
				b = true;
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

	@Override
	public int check(String food) {
		connect();
		int stock = 0;
		String sql = "select stock from food where food=?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, food);
			rs = psmt.executeQuery();
			while (rs.next()) {
				stock = rs.getInt("stock");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return stock;
	}

	public void checkUpdate(Food food) {
		connect();
		String sql = "update food set stock=? where food=?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, food.getStock());
			psmt.setString(2, food.getFood());
			psmt.executeUpdate();
			System.out.println("<< 수정되었습니다 >>");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

	}
	
	// 유효기간 알림
	public int expiryDate(int number) {
		connect();
		int ex = 0;
		String sql = "select date from food where number =?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1,number);
			psmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return ex;

	}

}
