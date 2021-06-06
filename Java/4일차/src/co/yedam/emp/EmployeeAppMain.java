package co.yedam.emp;

import java.util.Scanner;

public class EmployeeAppMain {
	public static void main(String[] args) {
		EmployeeApp emp = new EmployeeApp();
		Scanner scanner = new Scanner(System.in);
		boolean tf = true;
		int no = 0;
		while (tf) {
			System.out.println("1. 사원 수 | 2. 사원 정보 | 3. 사원리스트 | 4. 검색 | 5. 급여합계 | 6. 종료");
			no = scanner.nextInt();
			if (no == 1) {
				emp.number();
			} else if (no == 2) {
				emp.info();
			} else if (no == 3) {
				emp.list();
			} else if (no == 4) {
				emp.search();
			} else if (no == 5) {
				emp.sum();
			} else if (no == 6) {
				tf = false;
			}

		}

		System.out.println("종료되었습니다");
	}

}
