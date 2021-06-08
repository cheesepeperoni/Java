package co.memo.util;

import java.text.SimpleDateFormat ;
import java.util.Scanner;
import memo.model.Memo;

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
	//Friend 입력
	public static Memo readMemo() {
		System.out.println("날짜와 메모하실 내용을 입력하세요 _ (date:contents)");
		String result = scanner.nextLine();
		String[] arr = result.split(":");
		Memo memo = new Memo();			//혹은 new Friend(arr[0],arr[1],arr[2]);
		memo.setDate(arr[0]);
		memo.setContent(arr[1]);
		return memo;

	}

}
