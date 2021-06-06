package pkg.other;

import pkg.*;

public class AppMain {

	public static void main(String[] args) {
		Car car =  new Car();
		
		car.setModel("현대");
		car.setSpeed(100);
		
		Car car2 = new Car("삼성",50);
		Car car3 = new Car("삼성");
		
		
		System.out.println(DateUtil.curDate());
		System.out.println(ProjectInfo.name);
		

	}

}
