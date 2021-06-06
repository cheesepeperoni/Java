package co.yedam.app;
/* 
 * 연산자 테스트
 * 논리 :add(&&) or (||) not(!)
 * a++ ===> a=a+1
 * 
 * 조건 ? t : f ===> if 조건:
 *  				 ...
 *  				else:
 *  				 ...
 *  */
public class OperatorTest {

	public static void main(String[] args) {
		// 증감 연산자
		int x = 1;
		int y = 1;
		int result1 = ++x +10;
		System.out.println(String.format("x=%d 결과=%d",x,result1));
		int result2 = y++ +10;
		System.out.println(String.format("y=%d 결과=%d",x,result2));
		
		// 논리연산
		System.out.println(x>0 && y>0);
		System.out.println(x==0 && y==0);
		System.out.println(!(x==0 && y==0));
		System.out.println(!(x==0 || y==0));
		
		x=3;
		// 삼항연산
		System.out.println(x>0 && y>0 ? "둘다 양수": "아님");
		System.out.println(x % 2== 0 ? "짝수": "홀수");
		
	}

}
