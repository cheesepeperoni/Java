package 도형;

public class AppMain2 {

	public static void main(String[] args) {
		Shape s = new Rect(4, 5);	// 부모타입이 자식개체 참조
		execute(s);

		s = new Circle(4);
		execute(s);

	}

	public static void execute(Shape s) {
		s.area();   			            //다형성: 참조대상의 메서드 호출 -> 실행결과가 다르게 나옴
		if (s instanceof Movable){ 	
			((Movable)s).move();			//강제형변환
		}
	
	}

}
