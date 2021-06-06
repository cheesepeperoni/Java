package co.yedam.emp;

import java.util.Scanner;

public class EmployeeApp {
	String name; // 사원이름
	int employeeId; // 사원 아이디
	int salary; // 연봉
	int cnt = 0;
	Employee[] employee = new Employee[cnt];

	Scanner scanner = new Scanner(System.in);

	// 사원수 (1)
	public void number() {
		System.out.println("사원 수를 입력하세요");
		int n = scanner.nextInt();
	}

	// 사원 정보(2)
	public void info() {
		for (int i = 0; i < cnt; i++) {
			System.out.println("사번");
			employeeId = scanner.nextInt();
			System.out.println("이름");
			name = scanner.next();
			System.out.println("급여");
			salary = scanner.nextInt();

		}
	}

	// 사원리스트(3)
	public void list() {
		for (int i = 0; i < cnt; i++) {
			System.out.println(employee[i]);
		}

	}

	// 검색(4)
	public void search() {
		int s = 0;
		System.out.println("검색할 사번");
		s = scanner.nextInt();
		for (int i = 0; i < cnt; i++) {
			System.out.println("이름 : " + employee[s].name);
			System.out.println("급여 : " + employee[s].salary);
		}
	}

	// 합계(5)
	public void sum() {
		int result = 0;
		for (int i = 0; i < cnt; i++) {
			result += employee[i].salary;
		}
		System.out.println("급여: " + result);
	}

}
