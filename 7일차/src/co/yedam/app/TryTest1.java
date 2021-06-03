package co.yedam.app;

import java.util.Scanner;

public class TryTest1 {

	public static void main(String[] args) {
		// NulPointerException
		try {
			String s = null; // ""
			System.out.println(s.charAt(0));
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println(e.getMessage());
		}

		// ArrayIndexOutOfBoundsException
		try {
			int[] arr = new int[5]; // 0~4
			System.out.println(arr[5]);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		int a = 0;
		while (true) {
			try {
				System.out.print("입력>");
				Scanner scanner = new Scanner(System.in);
				a = scanner.nextInt();
				if (a < 5)
					break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("a:" + a);
		System.out.println("the end");
	}

}
