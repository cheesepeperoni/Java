package 클래스;

// 1. 클래스 선언
public class Robot {

	// 필드
	// private(클래스 내부에서만 접근 가능): 접근제어자
	private int arm;
	private int leg;
	private String name;

	// setter : 필드값을 변경
	public void setArm(int arm) {
		this.arm = arm;
	}

	public void setLeg(int leg) {
		this.leg = leg;
	}

	public void setName(String name) {
		this.name = name;
	}

	// getter : 필드값을 조회(변경은 불가)
	public int getArm() {
		return this.arm;
	}

	public int getLeg() {
		return this.leg;
	}

	public String getName(String name) {
		return this.name;
	}

	// 일반메서드
	public void print() {
		System.out.printf("arm: %d leg: %d ", arm, leg);
	}

	// 생성자 오버로딩 (생성자를 여러개 만들 수 있다는 뜻)
	// 기본 생성자
	// public Robot() {} 컴파일러가 기본으로 생성해주는 생성자
	public Robot() {
	} // 정의를 했기때문에 기본생성자도 적어주기

	public Robot(int arm, int leg) {
		this.arm = arm; // this 라는게 필드에 있는 arm을 뜻한다 (자기자신 객체를 참조하는 참조변수)
		this.leg = leg;

	}

	public Robot(int arm, int leg, String name) {
		this.arm = arm;
		this.leg = leg;
		this.name = name;

	}

	// getter : 필드값을 조회(변경은 불가)

}
