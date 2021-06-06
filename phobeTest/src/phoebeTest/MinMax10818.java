package phoebeTest;

import java.util.Scanner;

public class MinMax10818 {
	public static void main(String[] args) {
		// -1000000<n<100000
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] number = new int[n];
		int max = -1000000;
		int min = 1000000;
		
		for (int i = 0; i < n; i++) {
			number[i] = sc.nextInt();
			if (min > number[i]) {
				min = number[i];
			} else if (max < number[i]) {
				max = number[i];

			}
		}
		System.out.println(min + " " + max);
	}
	

}
