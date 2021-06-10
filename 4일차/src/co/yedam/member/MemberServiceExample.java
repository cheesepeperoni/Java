package co.yedam.member;

import java.util.Scanner;

public class MemberServiceExample {

	public static void main(String[] args) {
//		MemberService memberService = new MemberService();
//		memberService.insert("hong","12345","피비",0);
//		memberService.insert("kim","1111","모니카",0);
//		memberService.insert("choi","2222","레이첼",0);
//	
//		memberService.printList();
	
		MemberService member = new MemberService();
		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		int selectNo = 0;
		while (run) {
			System.out.println("1.등록 2. 전체조회 3. 번호로조회 4.로그인 5.id조회 6.종료");
			System.out.print("선택>");
			selectNo = scanner.nextInt();
			if (selectNo == 1) {
				member.insert();
			} else if (selectNo == 2) {
				member.printList();
			} else if (selectNo == 3) {
				member.printMember();
			} else if (selectNo == 4) {
				member.login();
			} else if (selectNo == 5) {
				member.search();
			} else if (selectNo == 6) {
				run = false;
			}

		}
		System.out.println("프로그램 종료");

	}

//		boolean result = memberService.login("hong","12345");
//		if(result) {
//			System.out.println("로그인 되었습니다");
//			memberService.logout("hong");
//		}else {
//			System.out.println("id또는 password가 올바르지 않습니다.");
//		}
}
