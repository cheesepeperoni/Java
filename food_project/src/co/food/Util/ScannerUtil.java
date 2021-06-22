package co.food.Util;

import java.util.Scanner;

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

}
