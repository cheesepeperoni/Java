package co.micol.test;

public class Human extends Animal{

	
	public void think() {
		System.out.println("생각하다");
	}

	@Override
	public void eat() {
		System.out.println("먹습니다");
	}
	
	
}
