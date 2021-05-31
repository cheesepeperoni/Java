package co.yedam.score;

import java.util.Scanner;

//작성자 :백명진 
public class ArrayApp {

	int[] arr ;  			//성적
	int studentNum;			//학생수
	
	Scanner scanner = new Scanner(System.in);


	void init() {
		System.out.print("인원수: ");  				//학생 수 입력받아서 초기화
		studentNum = scanner.nextInt();
		arr = new int[studentNum];
		
	}

	void input() {
		// 점수입력
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("score[%d]>",i);
			arr[i] = scanner.nextInt();

		}
	}

	// 점수리스트
	void print() {
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("score[%d]>%d\n",i,arr[i]);
		}
	}
	// 평균

	void avg() {
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			result += arr[i];
			
		}
		System.out.println("평균: " + result/arr.length);
	}
	// 최대값

	void max() {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("최대값: " + max);
	}
	

	public static void main(String[] args) {

		ArrayApp app = new ArrayApp();
		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		int selectNo=0;
		while(run) {
			System.out.println("1.학생수 2. 점수입력 3. 점수리스트 4.분석 5.종료");
			System.out.print("선택>");
			selectNo =scanner.nextInt();
			if(selectNo == 1) {
				app.init();
			}else if (selectNo ==2) {
				app.input();
			}else if (selectNo ==3) {
				app.print();
			}else if (selectNo ==4) {
				app.avg();
				app.max();
			}else if(selectNo ==5) {
				run = false;
				
			}
		
		}
		System.out.println("프로그램 종료");
		
	}
}
