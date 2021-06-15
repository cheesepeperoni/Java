package co.food.Util;

import java.text.SimpleDateFormat;
import java.util.Scanner;

import co.food.model.Food;

public class ScannerUtil {
	static Scanner scanner = new Scanner(System.in);

	public static int readInt(String prompt) {
		System.out.println(prompt + ">");
		return readInt();
	}

	public static int readInt() {
		int result = 0;
		while (true) {
			try {
				String temp = scanner.next();
				result = Integer.parseInt(temp);
				break;
			} catch (Exception e) {
				System.out.println("숫자 형식이 아닙니다");
			}
		}
		return result;
	}

	public static String readStr(String prompt) {
		System.out.println(prompt);
		System.out.println(">");
		return readStr();
	}

	public static String readStr() {
		String result = "";
		try {
			result = scanner.next();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public static String readDate() {
		String result = "";
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
		do {
			try {
				result = scanner.next();
				df.parse(result.trim());
				break;
			} catch (Exception e) {
				System.out.println("(yyyyMMdd)날짜형식이 아닙니다.");
			}
		} while (true);
		return result;
	}

	
//	public static readFood() {
//		System.out.print("제목, 작성자, 글내용>");
//		String result = scanner.next();
//		String[] arr = result.split(",");
//		Food food = new Food(arr[0], arr[1], arr[2]); 
//		return food;
//
//	}
//	public static int readComment() {
//		System.out.println("1 댓글작성 2 이전메뉴로 돌아갈까요");
//		return scanner.nextInt();
//	}
}
