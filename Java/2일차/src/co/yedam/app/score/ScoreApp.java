package co.yedam.app.score;

import java.util.Scanner;

/*
 * 성적처리 프로그램
 * 국어,영어,수학 입력
 * 총점, 평균, 등급 계산
 */
public class ScoreApp {
	int kor;
	int eng;
	int mat;
	int sum;
	float avg;
	char grade;
	
	
	Scanner scanner = new Scanner(System.in);
	//성적 입력
	void input() {
		//국어 , 영어 , 수학 입력
		System.out.println("국어 성적을 입력하세요:");
		kor = scanner.nextInt();
		System.out.println("영어 성적을 입력하세요:");
		eng = scanner.nextInt();
		System.out.println("수학 성적을 입력하세요:");
		mat = scanner.nextInt();
		
		
		sum = kor + eng + mat;
		avg = (float)sum/3;
		
	}
	//합계 계산
	int getSum() {
		//sum 계산
		return sum;
		
	}
	
	float getAvg() {
		return avg;
	}
	boolean isPass()	{			
		// 평균이 60 이상 true
		// 아니면 false;
			if(avg>60) {
				return true;
			}else {
				return false;
			}
	
	}

	char getGrade() {
		switch((int)avg/10) { //80 상   60 중   나머지 하
		case 10 : 
		case 9 :
		case 8 :grade= '상';break;
		case 7 : 
		case 6 :grade= '중';break;
		default:  grade ='하';break;
		}	
		return grade;	 
	}		
	}
	
	

