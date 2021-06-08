package 제어문;

public class WhileTest {

	public static void main(String[] args) {
		// 1~10
		int sum = 0;
		for (int i = 0; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);

		int i = 1;
		sum = 0;
		while (i <= 10) {
			sum += i;
			i++;
		}
		System.out.println(sum);
		
		//do
		i=0;
		sum = 0;
		do {							//do 에서 일단 실행하고 while에서 비교
			sum += i;
			i++;
		} while (i <= 10);
		System.out.println(sum);
	}
}
