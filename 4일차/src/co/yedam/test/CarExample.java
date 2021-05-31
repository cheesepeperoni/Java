package co.yedam.test;

public class CarExample {

	public static void main(String[] args) {
		// 2 객체생성(인스턴스)
		Car myCar = new Car();
		myCar.company="삼성자동차";
		myCar.maxSpeed=400;
		myCar.color="보라";

		System.out.println("제작회사: "+myCar.company);
		System.out.println("스피드: "+myCar.speed);
		
//		myCar.speed =100;
//		System.out.println("수정_스피드: "+myCar.speed);
		
		//생성자
		Car yourCar = new Car("르노","SM6","핑크");
		System.out.println(yourCar);
		
		//"코나 100"
		Car miniCar = new Car("코나",100);
		System.out.println(miniCar);
	}

}
