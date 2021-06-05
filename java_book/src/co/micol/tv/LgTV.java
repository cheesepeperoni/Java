package co.micol.tv;

public class LgTV implements RemoteControl {
	
	
	public void LgTv() {

		System.out.println("엘지 티비 객체생성");
	}

	public void powerOn() {
		System.out.println("엘지 티비 전원 on");

	}

	public void powerOff() {

		System.out.println("엘지 티비 전원 off");
	}

	public void volumeUp() {
		System.out.println("엘지 티비 볼륨 up");

	}

	public void volumeDown() {
		System.out.println("엘지 티비 볼륨 down");

	}
}
