package co.micol.tv;

public class SamsungTV implements RemoteControl {

	
	public void SamsungtTv() {
		
		System.out.println("삼성 티비 객체생성");
	}

	public void powerOn() {
		System.out.println("삼성티비 전원 on");
		
	}

	public void powerOff() {
		
		System.out.println("삼성 티비 전원 off");
	}

	public void volumeUp() {
		System.out.println("삼성 티비 볼륨 up");
		
	}

	public void volumeDown() {
		System.out.println("삼성 티비 볼륨 down");
		
	}

}
