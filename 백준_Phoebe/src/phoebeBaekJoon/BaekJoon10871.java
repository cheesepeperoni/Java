package phoebeBaekJoon;

import java.util.Scanner;

public class BaekJoon10871 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int x = scn.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;++i){
			arr[i]=scn.nextInt();
		}
		for(int i=0;i<arr.length;++i) {
			if(arr[i]<x) {
				System.out.print(arr[i]+" ");
			}
		}
	}
}
