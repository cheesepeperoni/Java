package co.board.access;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import co.board.Util.DAO_b;
import co.board.model.Board;

public class BoardDAO extends DAO_b implements BoardAccess {
	static PreparedStatement psmt;
	static ResultSet rs;
	static Connection conn;

	@Override
	public void insert(Board board) {
		connect();
		try {
			psmt = conn.prepareStatement("insert into board(b_title,b_content,b_writer) values(?,?,?)");
			psmt.setString(1, board.getTitle());
			psmt.setString(2, board.getContent());
			psmt.setString(3, board.getWriter());
			int r = psmt.executeUpdate();
			System.out.println(r + "건 입력");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}

	}

	@Override
	public void update(Board board) {
		connect();
		try {
			psmt = conn.prepareStatement("update board set b_content=? where b_id=?");
			psmt.setString(1, board.getContent());
			psmt.setString(2, board.getId());
			int r = psmt.executeUpdate();
			System.out.println(r + "건 수정");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}

	}

	@Override
	public void delete(String id) {
		connect();
		try {
			psmt = conn.prepareStatement("delete from board where b_id=?");
			psmt.setString(1, id);
			int r = psmt.executeUpdate();
			System.out.println(r + "건 삭제");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}

	}

	@Override
	public ArrayList<Board> selectAll() {
		connect();
		ArrayList<Board> bList = new ArrayList<>();
		try {
			psmt = conn.prepareStatement("select * from board");
			rs = psmt.executeQuery();
			while (rs.next()) {
				Board board = new Board();
				board.setId(rs.getString("b_id"));
				board.setTitle(rs.getString("b_title"));
				board.setContent(rs.getString("b_content"));
				board.setWriter(rs.getString("b_writer"));
				bList.add(board);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return bList;
	}

	@Override
	public Board selectOne(String id) {
		connect();
		String sql = "select * from board where b_id=?";
		Board b = null;
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			rs = psmt.executeQuery();
			if (rs.next()) {
				b = new Board(); // instance 를 생성하고 변수 p에 대입
				b.setId(rs.getString("b_id"));
				b.setTitle(rs.getString("b_title"));
				b.setContent(rs.getString("b_content"));
				b.setWriter(rs.getString("b_writer"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return b;

	}

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
}
