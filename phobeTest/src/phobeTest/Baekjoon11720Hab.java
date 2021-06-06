package phobeTest;

import java.util.Scanner;

public class Baekjoon11720Hab {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String num = sc.next();
		int result = 0;
		for (int i = 0; i < n; i++) {
			result +=num.charAt(i)-'0';			//아스키코드 -	'0';
		}
		System.out.println(result);
	}

}
