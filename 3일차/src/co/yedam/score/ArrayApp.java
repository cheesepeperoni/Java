package co.yedam.score;

public class ArrayApp {
	
	int[] arr = new int[10];

	
	void init() {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100) + 1;

		}
	}

	// 배열 출력
	void print() {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	// 합계

	void total() {
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			result += arr[i];
		}
		System.out.println("합계" + result);
	}
	// 최대값

	void max() {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			System.out.println("최대값" + max);
		}
	}

	public static void main(String[] args) {

		ArrayApp app = new ArrayApp();
		app.init();
		app.total();
		app.max();
		app.print();

	}
}
