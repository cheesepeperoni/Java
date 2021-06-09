package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class SqliteConnect {
	// 필드로 선언
	static PreparedStatement psmt;
	static ResultSet rs;
	static Connection conn;

	// 1.조회 2.입력 3.수정 4.삭제 5.전체리스트(각각 기능을 분리) => 메소드로 기능분리

	// 전체리스트
	public static ArrayList<Person> getPersonList() {
		ArrayList<Person> personList = new ArrayList<>();
		connect(); // Connetion 객체연결이 없으면 null이 나옴
		String sql = "select * from person";
		try {
			psmt = conn.prepareStatement(sql); // sql담아오고 실행하는것을 담음 / PrepareStatement 쿼리를 실행하고 결과를 받아옴
			rs = psmt.executeQuery(); // 쿼리실행결과를 가져오는 부분
			while (rs.next()) {
				// System.out.println(rs.getInt("id")+","+rs.getString("name"));
				Person person = new Person();
				person.setId(rs.getInt("id"));
				person.setName(rs.getString("name"));
				person.setAge(rs.getInt("age"));
				person.setPhone(rs.getString("phone"));
				personList.add(person);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return personList;
	}

	// 전체리스트(오버로딩) 이름으로 조회
	public static ArrayList<Person> getPersonList(String name) {
		ArrayList<Person> personList = new ArrayList<>();
		connect(); // Connetion 객체연결이 없으면 null이 나옴
		String sql = "select * from person where name = ? ";
		try {
			psmt = conn.prepareStatement(sql); // sql담아오고 실행하는것을 담음 / PrepareStatement 쿼리를 실행하고 결과를 받아옴
			psmt.setString(1, name);
			rs = psmt.executeQuery(); // 쿼리실행결과를 가져오는 부분
			while (rs.next()) {
				// System.out.println(rs.getInt("id")+","+rs.getString("name"));
				Person person = new Person();
				person.setId(rs.getInt("id"));
				person.setName(rs.getString("name"));
				person.setAge(rs.getInt("age"));
				person.setPhone(rs.getString("phone"));
				personList.add(person);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return personList;
	}

	// 한건조회(id로 조회)
	public static Person getPerson(int id) {
		connect();
		String sql = "select * from person where id=?";
		Person p = null;
		try {
			psmt = conn.prepareStatement(sql); // PreparedStatement 객체생성
			psmt.setInt(1, id);
			rs = psmt.executeQuery(); // select할때
			if (rs.next()) {
				p = new Person(); // instance 를 생성하고 변수 p에 대입
				p.setId(rs.getInt("id"));
				p.setName(rs.getString("name"));
				p.setAge(rs.getInt("age"));
				p.setPhone(rs.getString("phone"));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return p;
	}

	// 입력기능
	public static void insertPerson(int id, String name, int age, String phone) {
		connect();
		String sql = "insert into person values(?,?,?,?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, id);
			psmt.setString(2, name);
			psmt.setInt(3, age);
			psmt.setString(4, phone);
			int r = psmt.executeUpdate(); // insert,update,delete 할 때 사용
			System.out.println(r + "건 입력");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
	}

	// 수정기능
	public static void updatePerson(Person p) {
		connect();
		String sql = "update person set name=?, age=?, phone=? where id=?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, p.getName());
			psmt.setInt(2, p.getAge());
			psmt.setString(3, p.getPhone());
			psmt.setInt(4, p.getId());
			int r = psmt.executeUpdate();
			System.out.println(r + "건 수정");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		// 내가 한 방식
//		String sql ="update person set name=?,age=?,phone=? where id=?";
//		try {
//			psmt=conn.prepareStatement(sql);
//			psmt.setString(1, name);
//			psmt.setInt(2, age);
//			psmt.setString(3, phone);
//			psmt.setInt(4, id);
//			int r = psmt.executeUpdate();
//			System.out.println(r + "건 수정");
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}finally {
//			close();
//		}
	}

	// 삭제기능
	public static void deletePerson(int id) {
		connect();
		String sql = "delete from person where id = ? ";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, id);
			int r = psmt.executeUpdate();
			System.out.println(r + "건 삭제");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

	}

	// 연결
	public static void connect() {
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

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("1:전체리스트 2:입력 3:수정 4:삭제 5:한건조회 6:이름으로 조회 9:종료");
			int menu = scanner.nextInt();
			if (menu == 1) {
				// 전체리스트 기능
				System.out.println("조회 결과");
				ArrayList<Person> list = getPersonList();
				for (Person person : list) {
					System.out.println(person);
				}
			} else if (menu == 2) {
				// 입력기능
				System.out.print("아이디를 입력하세요:");
				int searchId = scanner.nextInt();
				scanner.nextLine();
				System.out.print("이름을 입력하세요:");
				String name = scanner.nextLine();
				System.out.print("나이를 입력하세요:");
				int age = scanner.nextInt();
				scanner.nextLine();
				System.out.print("전화번호를 입력하세요:");
				String phone = scanner.nextLine();

				insertPerson(searchId, name, age, phone);
			} else if (menu == 3) {
				// 수정기
				System.out.print("수정할 아이디를 입력하세요:");
				int searchId = scanner.nextInt();
				scanner.nextLine();
				Person p = getPerson(searchId);

				if (p == null) { // 조회아이디가 존재x
					System.out.println("존재하지 않는 아이디");
					continue;
				}
				System.out.print("변경할 이름:");
				String chanegeName = scanner.nextLine();
				System.out.print("변경할 나이:");
				String chanegeAge = scanner.nextLine();
				System.out.print("변경할 폰넘버: ");
				String chanegePhone = scanner.nextLine();
				if (!chanegeName.equals("")) {
					p.setName(chanegeName);
				}
				if (!chanegeName.equals("")) {
					p.setName(chanegeName);
				}
				if (!chanegeAge.equals("")) {
					p.setAge(Integer.parseInt(chanegeAge));
				}
				if (!chanegePhone.equals("")) {
					p.setPhone(chanegePhone);
				}
				updatePerson(p);
//				int updateId = scanner.nextInt();
//				scanner.nextLine();
//				System.out.println("변경할 이름을 입력하세요:");
//				String name = scanner.nextLine();
//				System.out.println("변경할 나이를 입력하세요:");
//				int age = scanner.nextInt();
//				scanner.nextLine();
//				System.out.println("변경할 전화번호를 입력하세요:");
//				String phone = scanner.nextLine();
//
//				updatePerson(updateId, name, age, phone);
			} else if (menu == 4) {
				// 삭제기능
				System.out.print("삭제할 아이디를 입력하세요: ");
				int deleteId = scanner.nextInt();
				deletePerson(deleteId);

			} else if (menu == 5) {
				// 한건조회
				System.out.print("조회할 아이디를 입력하세요: ");
				int searchId = scanner.nextInt();
				Person p = getPerson(searchId);
				if (p == null) {
					System.out.println("조회된 값이 없습니다");
				} else {
					System.out.println(p);
				}
			} else if (menu == 6) {
				System.out.print("조회할 이름을 입력하세요: ");
				String searchName = scanner.next();
				ArrayList<Person> list = getPersonList(searchName);
				for (Person person : list) {
					System.out.println(person);
				}

			} else if (menu == 9) {
				break;
			}
		} // end of while
		scanner.close();
		System.out.println("정상적인 종료");
	}// end of main
}// end of class
