package co.yedam.numgame;

import java.util.Scanner;

public class NumberGameApp {
	// 작성자 : 백명진 
	// 수정 예정 _ 계속 컴퓨터가 0만줘서 뭔가 틀린 것 같음..
	// 컴퓨터가 임의의수를 생성
	int com; // 컴퓨터 만든 수 (1~10)
	int user; // 사용자가 입력한 값

	Scanner scanner = new Scanner(System.in);

	void init() {
		// 난수(1~10)
		int com = (int) (Math.random() * 10 + 1);

	}

	// 사용자가 수를 입력
	void input() {
		// scanner를 이용해서 정수값 입력
		System.out.println("수를 입력하세요(1~10):");
		user = scanner.nextInt();
		
	} 	

	// 높다/낮다:false 답이면:true
	boolean confirm() {
		// com과 user를 비교해서 같으면 true
		// 다르면 높다/낮다 출력하고 false 리턴
		if (com == user) {
			System.out.println("정답");
			return true;
		}
		else {
			if(com>user) {
			System.out.println("높다");
			}
			else {
			System.out.println("낮다");
			}
			return false;
		}
	}

	void start() {
		init();
		while (true) {
			input();
			if (confirm()) {
				break;
			}
		}

	}
}
