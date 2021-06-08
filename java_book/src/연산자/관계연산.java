package 연산자;

public class 관계연산 {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		//and연산(&&) , 첫번째 관계식이 false면 두번째 관계식은 계산안함 / or (||) 연산 첫번째 관계식이 true면 뒤에 볼 필요 없이 true성립
		if (y++ > 10 && x++ > 10) {			// ++이 뒤에 있어서 크다작다 검사하고 증가된다 
			System.out.println("A");
		} else {
			System.out.println("B");
		}
		System.out.println(x);
		System.out.println(y);
	}

}
