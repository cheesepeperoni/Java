package 스레드;

public class 동기화 {

	public static void main(String[] args) {
		// 공유객체
		Calculator calculator = new Calculator();

		User1 user1 = new User1();	
		user1.setCalculator(calculator);		//100 2초대기

		User2 user2 = new User2();
		user2.setCalculator(calculator);		//50 2초대기 
		//동기화: (동시에 실행)총 2초대기인데 synchronized 걸면 실행하고 다음꺼 실행(4초{2초대기하고 1번뜨고 2초대기하고 2번뜨고}) 
		user1.start();
		user2.start();

	}

}
