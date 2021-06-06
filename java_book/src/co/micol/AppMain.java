package co.micol;

public class AppMain {

	public static void main(String[] args) {
		Human human = new Human();
		human.sleep();
		human.think();
		
		
		Bird bird = new Bird();
		bird.layEggs();
		bird.takeOff();
		bird.land();
		
		
		Superman superman = new Superman();
		superman.takeOff();
		superman.fly();
		superman.land();
		
		
		
	}

}
