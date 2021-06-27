package phoebeBaekJoon;

import java.util.Scanner;

public class BaekJoon10871 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		//두 값 받기
		int n = scn.nextInt();
		int x = scn.nextInt();
		//배열 안의 요소 입력
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; ++i) {
			arr[i] = scn.nextInt();
		}
		//x보다 작은 수 
		for (int i = 0; i < arr.length; ++i) {
			if (arr[i] < x) {
				System.out.print(arr[i] + " ");
			}
			scn.close();
		}
	}
}
