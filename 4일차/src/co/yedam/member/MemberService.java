package co.yedam.member;

import java.util.Scanner;

public class MemberService {
	// login(id,pw) :id=hong , pw=12345
	// logout (id) :로그아웃
	Scanner scanner = new Scanner(System.in);
	Member[] members = new Member[10];
	int cnt = 0;

	void insert(String id, String password, String name, int age) {
		members[cnt] = new Member(id, password, name, age);
		cnt++;
	}

	void insert() {
		String id = scanner.next();
		String password = scanner.next();
		String name = scanner.next();
		int age = scanner.nextInt();
		members[cnt] = new Member(id, password, name, age);
		cnt++;
	}

	// 회원 리스트
	void printList() {
		for (int i = 0; i < cnt; i++) {
			System.out.println(members[i]);
		}
	}

	// 번호로 조회
	void printMember(int i) {
		System.out.println(members[i].name);
		System.out.println(members[i].id);
		System.out.println(members[i].age);

	}

	// 로그인
	boolean login(String id, String password) {
		boolean result = false;
		for (int i = 0; i < cnt; i++) {
			if (id.equals(members[i].id) && password.equals(members[i].password)) {
				result = true;
				break;
			}
		}
		return result;

	}

	// id 조회
	void search(String id) {
		for (int i = 0; i < cnt ; i++) {
			if(id.equals(members[i].id)){
				System.out.println(members[i].id);
				System.out.println(members[i].name);
				System.out.println(members[i].age);
		}
		}
	}
	
	void logout(String id) {
		System.out.println("로그아웃 되었습니다.");

	}

}
