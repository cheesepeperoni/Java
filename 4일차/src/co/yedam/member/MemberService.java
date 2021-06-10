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
		System.out.print("ID > ");
		String id = scanner.next();
		System.out.print("Password > ");
		String password = scanner.next();
		System.out.print("이름 > ");
		String name = scanner.next();
		System.out.print("나이 > ");
		int age = scanner.nextInt();
		members[cnt] = new Member(id, password , name, age);
	}

	// 회원 리스트
	void printList() {
		for (int i = 0; i < members.length; i++) {
			System.out.println(members[i]);
			
		}
	}

	// 번호로 조회
	void printMember() {
		System.out.print("번호 입력 > ");
		int i = scanner.nextInt();
		System.out.println("이름 :"+members[i].name);
		System.out.println("id :"+members[i].id);
		System.out.println("나이:"+members[i].age);

	}

	// 로그인
	void login() {
		System.out.println("ID > ");
		String id = scanner.next();
		System.out.println("Password > ");
		String password = scanner.next();
		for (int i = 0; i < members.length; i++) {
			if (id.equals(members[i].id) && password.equals(members[i].password)) {
				System.out.println("로그인 되었습니다.");
				break;
			} else {
				System.out.println("등록되지 않은 회원입니다");
			}
		}

	}

	// id 조회
	void search() {
		System.out.println("id를 입력하세요 > ");
		String id = scanner.next();
		for (int i = 0; i < members.length; i++) {
			if (id.equals(members[i].id)) {
				System.out.println(members[i].name);
				System.out.println(members[i].age);
			}
		}
	}

	void logout(String id) {
		System.out.println("로그아웃 되었습니다.");

	}

}
