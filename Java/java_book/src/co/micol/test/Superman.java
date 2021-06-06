package co.micol.test;

//다중 상속 안됨
public class Superman extends Human implements Flyer {
	
	@Override
	public void takeOff() {
		System.out.println("슈퍼맨 고!");
	}
	@Override
	public void fly() {
		System.out.println("슈퍼맨 날아");
	}
	@Override
	public void land() {
		System.out.println("슈퍼맨 착륙");
	}
}

