package 상속;

public class DmbCellPhone extends CellPhone {
	int channel;
	
	@Override // 재정의   //오버로딩(중복정의)_override와 차이
	// 상속받은 메서드를 수정
	void powerOn() {
		super.powerOn();
		System.out.println("DMB 전원 on");
	}
	
	
	
	public DmbCellPhone() {
		super(); // 생략가능
		System.out.println("DmbCellPhone 기본 생성자");
	}
	public DmbCellPhone (String model, String color, int channel) {
		super(model,color); // 부모생성자는 제일 위에 this 밑에 가면 안됨 부모생성자를 선택해서 호출 할 수있다)
		this.channel = channel;
		System.out.println("DmbCellPhone 생성자");
	}
	
	void turnOnDmb() {
		System.out.println("채널"+ channel +"번 DMB 방송수신 시작");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송수신 종료");
	}
	void changeChannel (int channel) {
		this.channel = channel;
		System.out.println("채널 변경");
	}
	
	
	
}
