package co.friend.access;
// FriendAccees.java(인터페이스),FriendList.java(구현클래스)

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import co.friend.Util.DAO;
import co.friend.model.Friend;

public class FriendDAO extends DAO implements FriendAccess {

	PreparedStatement psmt;
	ResultSet rs;
	String sql;

	//name, tel 값을 담아주는 컬렉션
	public Map<String,String> getNameTel(){
		Map<String,String> map = new HashMap<>();
		try {
			psmt=conn.prepareStatement("select name,tel from friend");
			rs = psmt.executeQuery(); 
			while (rs.next()) {
				map.put(rs.getString("name"),rs.getString("tel"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return map;
	}
	
	@Override
	public void insert(Friend friend) {
		try {
			psmt = conn.prepareStatement("insert into friend values(?,?,?)");
			psmt.setString(1, friend.getGubun());
			psmt.setString(2, friend.getName());
			psmt.setString(3, friend.getTel());
			int r = psmt.executeUpdate();
			System.out.println(r + "건 입력");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
 
	@Override
	public void update(Friend friend) {
		// 구분, 이름, 전화
		// 동일한 이름은 없다는 전제
		// where name=?
		try {
			psmt = conn.prepareStatement("update friend set tel=? where name=?");
			psmt.setString(1, friend.getTel());
			psmt.setString(2, friend.getName());
			int r = psmt.executeUpdate();
			System.out.println(r + "건 수정");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete(String name) {
		try {
			psmt = conn.prepareStatement("delete from friend where name=?");
			psmt.setString(1, name);
			int r = psmt.executeUpdate();
			System.out.println(r + "건 삭제");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public ArrayList<Friend> selectAll() {
		ArrayList<Friend> fList = new ArrayList<>();
		try {
			psmt = conn.prepareStatement("select * from friend");
			rs = psmt.executeQuery();
			while (rs.next()) {
				Friend friend = new Friend();
				friend.setGubun(rs.getString("gubun"));
				friend.setName(rs.getString("name"));
				friend.setTel(rs.getString("tel"));
				fList.add(friend); // 데이터 건수만큼 ArrayList 담아서 반환
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return fList;
	}

	@Override
	public Friend selectOne(String name) {
		String sql = "select * from friend where name=?";
		Friend f = null;
		try {
			psmt = conn.prepareStatement(sql); // PreparedStatement 객체생성
			psmt.setString(1, name);
			rs = psmt.executeQuery(); // select할때
			if (rs.next()) {
				f = new Friend(); // instance 를 생성하고 변수 p에 대입
				f.setGubun(rs.getString("gubun"));
				f.setName(rs.getString("name"));
				f.setTel(rs.getString("tel"));
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return f;
	}

	@Override
	public Friend findTel(String tel) {
		String sql = "select * from friend where tel =?";
		Friend f = null;
		try {
			psmt = conn.prepareStatement(sql); // PreparedStatement 객체생성
			psmt.setString(1, tel);
			rs = psmt.executeQuery(); // select할때
			if (rs.next()) {
				f = new Friend(); // instance 를 생성하고 변수 p에 대입
				f.setGubun(rs.getString("gubun"));
				f.setName(rs.getString("name"));
				f.setTel(rs.getString("tel"));
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return f;
	}

}
