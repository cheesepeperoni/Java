package phobeTest;

public class JavaTestStar {

	public static void main(String[] args) {
		for (int i = 1; i < 5; i++) {				//4개의 줄
			for (int j = 1; j <= i; j++) {			//행의 순서만큼 반복(첫 번 째 줄이면 1, 두 번 째 줄이면 2 ..)
				System.out.print("*");
				if (j == i) {
					System.out.println();			//줄 바꿈
				}
			}
		}

		for (int i = 1; i < 5; i++) {				//4개의 줄
			for (int j = 4; j > 0; j--) {			//4부터 줄어들며 반복
				if (i < j) {						
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
