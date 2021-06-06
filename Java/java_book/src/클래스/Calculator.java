package 클래스;

public class Calculator {
	//싱글톤
	private static Calculator instance = new Calculator();
	public static Calculator getInstance() {
		return instance;
	}
//	public void setInstance(Calculator instance) {
//		this.instance = instance;
//	}



	private Calculator() {}
	public int add(int a, int b) {
		return a+b;
		
		
	}
}
