package phoebeBaekJoon;

import java.util.Scanner;

public class BaekJoon2739 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("몇단?>");
		int gu = scn.nextInt();
		for(int i=1;i<10;i++) {
			System.out.println(gu+"*"+i+"="+gu*i);
			scn.close();
		}
	}
}
