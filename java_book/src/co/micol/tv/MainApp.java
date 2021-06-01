package co.micol.tv;

public class MainApp {

	public static void main(String[] args) {
		//SamsungTV tv = new SamsungTV();
		//LgTV tv = new LgTV();
		//2. 다형성 : 참조하는 대상의 메서드가 호출
		//코드는 같아도 참조 대성에 따라서 실행결과가 다르게 나온다
		//1. 부모 타입의 참조변수가 자식객체를 참조할수 있다.
		RemoteControl tv = (RemoteControl)BeanFactory.getBean(args[0]);
		
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
	}

}
