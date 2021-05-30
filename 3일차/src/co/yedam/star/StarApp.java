package co.yedam.star;

public class StarApp {

	// 삼각형 출력
	void draw(int cnt) {
		for (int i = 1; i <= cnt; i++) {
			System.out.println(pad('*', i));
		}
	}

	// 역삼각형 출력
//	void drawInvert() {
//		for (int i = 8; i >= 1; i--) {
//			System.out.println(pad('*', i));
//		}
//	}

	void drawInvert(int cnt) {
		for (int i = 1; i <= cnt; i++) {
			System.out.println(pad('*', cnt - i));
		}
	}

	// 이등변삼각형 출력
//	void drawEq(int cnt) {
//			for (int i = 1; i <= cnt; i++) {
//				System.out.print(pad(' ', cnt - i + 1));
//				System.out.println(pad('*', i * 2 - 1));
//			}

	// 나무 출력
	void drawTitle(String a, int b) {
		for (int i = 1; i < b; i++)
			;
		System.out.println(pad('=', b /2));
		System.out.println(a);
		System.out.println(pad('=', b /2));
	}

	void drawEq(int cnt) {
		for (int i = 1; i <= cnt; i++) {
			System.out.print(pad(' ', cnt - i + cnt));
			System.out.println(pad('x', i * 2 - 1));

		}
	}

	void drawEq_2(int a, int b) {
		for (int i = a; i <= b; i++) {
			System.out.print(pad(' ', (b+2) - i));
			System.out.println(pad('x', i * 2 - 1));
		}

	}

	void drawEq_3(int a, int b) {
		for (int i = a; i <= b; i++) {
			System.out.print(pad(' ', b - i));
			System.out.println(pad('x', i * 2 - 1));
		}
	}

	void drawRect(int c) {
		for (int i = 1; i <= c; i++) {
			System.out.print(pad(' ', c * 2 - 2));
			System.out.println(pad('x', c - 1));

		}
	}

	// 다이아몬드 출력
	void drawDia(int cnt) {
		for (int i = 1; i <= cnt; i++) {
			System.out.print(pad(' ', cnt - i + 1));
			System.out.println(pad('*', i * 2 - 1));
		}
		for (int i = cnt - 1; i >= 1; i--) {
			System.out.print(pad(' ', cnt - i + 1));
			System.out.println(pad('*', i * 2 - 1));
		}
	}

	// (* , 10) --> "*********"
	String pad(char s, int cnt) {
		String result = "";
		for (int i = 1; i <= cnt; i++) {
			result += s;
		}
		return result;
	}
}