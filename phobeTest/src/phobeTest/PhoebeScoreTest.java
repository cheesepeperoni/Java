package phobeTest;

import java.util.Scanner;

public class PhoebeScoreTest {

	public static void main(String[] args) {
		String[] sub = new String[5]; // 과목명을 담을 배열
		int[] score = new int[5]; // 점수를 담을 배열
		int sum = 0, max = 0, min = 100; // 합계,최대,최소
		double avg; // 평균

		sub[0] = "국어";
		sub[1] = "수학";
		sub[2] = "영어";
		sub[3] = "과학";
		sub[4] = "사회";

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < sub.length; i++) {
			System.out.print(sub[i] + " 점수를 입력하세요:");
			score[i] = sc.nextInt(); // 점수를 score 배열에 저장
		}
		for (int j = 0; j < score.length; j++) {
			sum = sum + score[j]; // 합계

			if (score[j] > max) {
				max = score[j];
			}
			if (score[j] < min) {
				min = score[j];
			}

		}
		avg = (double) sum / sub.length;
		System.out.print("총합:"+sum+" 평균:"+avg+" 최대점수:"+max+" 최소점수:"+min);
	}
	

}
