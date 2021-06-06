package co.yedam.app;

import java.util.Scanner;

/*
 *  형변환: 캐스트 연산자(타입)
 *  정수형: byte<short<int<long
 *  실수형:            float<double
 *  
 *  스트링 <--------> byte    Byte.parseByte(변수)
 *  				short	Short.parseShort
 *  				int		Integer.parseInt
 *  				long
 *  				float
 *  				double
 *  				char
 *  				boolean
 *   	 <--------- Byte.valueOf
 *  
 */
public class CastTest {

	public static void main(String[] args) {
		// 자동형 변환
		int a =10;
		long b= a;
		
		//강제형변환
		a = (int)b;
		
		//char(문자) <-> int 문자(코드)
		char c= 'Z';
		System.out.println((int)c);
		int d = 97;
		System.out.println((char)d);
		
		//실수(double)-> 정수(int)
		double e =10.5;
		long f =(int)e;
		System.out.println(f);
		
		//용량이 더 큰 쪽 타입으로 변환
		double g = 5 + 10.5;
		String h = "hi" + 5;
		System.out.println(g);
		System.out.println(h);
		System.out.println("hi"+5+10);
		System.out.println();
		
		
		//정수끼리의 결과는 정수. 
		//5나 2둘 중에 하나만 float나 double로 바꿔주면 결과값이 소수점까지 나옴.
		System.out.println((float)5/2);
		
		
		double i = 5/(double)2;
		System.out.println(i);
		
		// 스트링 - >int
		String s1 = "123";
		int j = Integer.parseInt(s1);
		
		//int -> 스트링
		String s2 = String.valueOf(10.5);
			
		Scanner scanner =new Scanner(System.in);
		System.out.print("입력:");
		String greet = scanner.next();
		
		System.out.println(greet);
		
	
		
		
		
	}


}

