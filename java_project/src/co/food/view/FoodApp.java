package co.food.view;

import java.util.List;
import java.util.Scanner;

import co.food.Util.ScannerUtil;
import co.food.access.FoodDAO;
import co.food.model.Food;

public class FoodApp {
	FoodDAO foodList = new FoodDAO();
	Scanner scanner = new Scanner(System.in);
	Scanner scan = new Scanner(System.in);
	String userId;
	String userPw;

	public void front() {
		int num;
		System.out.println("[    1 .Log-in   2.Sign Up    ]");
		System.out.print("입력>>");
		num = scanner.nextInt();
		if (num == 1) {
			logIn();
		} else if (num == 2) {
			signup();
		}

	}

	public void logIn() {
		System.out.println("▶  로그인  ◀");
		System.out.print("ID를 입력하세요>");
		userId = scanner.next();
		System.out.print("비밀번호를 입력하세요>");
		userPw = scanner.next();
		boolean right = foodList.login(userId, userPw);
		if (right == true) {
			System.out.println("<< 로그인 되었습니다 >>");
			start();
		} else {
			System.out.println("┏━━━━   틀렸습니다  ━━━━┓ ");
			System.out.println("┗━━ 다시 확인해주십시오 ━━┛");
			logIn();

		}
	}

	// 회원탈퇴
	private void resign() {
		System.out.println("▶ 회원 탈퇴 ◀");
		System.out.print("비밀번호를 입력하세요>");
		String byeP = scanner.next();		
			if (byeP.equals(userPw)) {				
				System.out.println("<< 탈퇴처리 되었습니다. 수고하셨습니다 >>");
				foodList.deleteAccount(userId,userPw);
				front();
			} else {
				System.out.println("┏━━━━   틀렸습니다  ━━━━┓ ");
				System.out.println("┗━━ 다시 확인해주십시오 ━━┛");
				resign();
			
		}
	}

	// 시작!
	public void start() {
		int menuNum;
		do {
			menuTitle();
			menuNum = ScannerUtil.readInt("입력>");
			switch (menuNum) {
			case 1:foodAll();break;
			case 2:insert();break;
			case 3:update();break;
			case 4:delete();break;
			case 5:foodOne();break;
			case 6:resign();break;
			}
		} while (menuNum != 0);
		System.out.println("《  종료되었습니다  》");
	}

	// 전체조회
	private void foodAll() {
		List<Food> list = foodList.foodAll();
		for (Food food : list) {
			System.out.println(food);
		}
	}

	// 입력
	private void insert() {
		System.out.print("재료>");
		String ing = scanner.next();
		System.out.print("내용>");
		String con = scan.nextLine();
		System.out.print("유효기간>");
		String exp = scanner.next();
		Food food = new Food(ing, con, exp);
		foodList.insert(food);
	}

	// 수정
	private void update() {
		Food food = new Food();
		System.out.print("조회할 번호를 입력하세요>");
		food.setNumber(scanner.nextInt());
		System.out.print("수정할 재료>");
		food.setFood(scanner.next());
		System.out.print("수정할 내용>");
		food.setContent(scan.nextLine());
		System.out.print("수정할 유통기한>");
		food.setDate(scanner.next());
		foodList.update(food);
	}

	// 삭제
	private void delete() {
		System.out.print("삭제할 번호를 입력하세요>");
		int number = scanner.nextInt();
		foodList.delete(number);
	}

	// 재료로 조회
	private void foodOne() {
		System.out.print("조회하실 재료를 입력하세요>");
		String ing = scanner.next();
		System.out.println(foodList.foodOne(ing));
	}

	private void signup() {
		System.out.println("[ 직원 전용 회원가입 ]");
		System.out.print("사용하실 ID를 입력하세요>");
		String newId = scanner.next();
		System.out.print("사용하실 비밀번호를 입력하세요>");
		String newPw = scanner.next();
		//Food food = new Food(newId, newPw);
		foodList.signUp(newId, newPw);
		logIn();

	}

	public void menuTitle() {
		System.out.println("┌───────────────────┐");
		System.out.println("│    1 재료 전체조회   │");
		System.out.println("│    2 등록하기       │");
		System.out.println("│    3 수정하기       │");
		System.out.println("│    4 삭제          │");
		System.out.println("│    5 재료 조회하기   │");
		System.out.println("│    6 회원 탈퇴      │");
		System.out.println("│    0 종료          │");
		System.out.println("└───────────────────┘");

	}

}
