package 연산자;
/*
 * ^ : xor - 서로 다르면 1
 * & : and - 마스크
 * | : or  
 */
public class 비트연산 {

	public static void main(String[] args) {
		//암호화 / 복호화
		int a = 04474;				//a 8진수
		int key = 01111;
		System.out.println("원문:"+a);
		
		int b = a^key;
		System.out.println("암호화"+b);
		
		int c = b^key;
		System.out.println("복호화"+c);
		
		int d = 0b10101111;        //d 2진수
		int e = 0b00000010;
		System.out.println(Integer.toBinaryString(d&e));		//& = and 연산
		
		System.out.println("----------------------");
		//시프트 연산
		int f = 8;
		System.out.println(f>>1);			//1000 -> 0100 (>>오른쪽으로 나누기2) (<<왼쪽으로 곱하기2)  그냥 나눌때보다 속도 up
		System.out.println(f<<1);
		
		
		

	}

}
