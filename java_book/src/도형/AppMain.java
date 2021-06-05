package 도형;

public class AppMain {

	public static void main(String[] args) {
		// 부모인 Shape은 한번만 선언하면 된다.
//		Shape s = new Rect(4,5);
//		s.area();
//		s.print();
//		
//		s = new Tri(4,5);
//		s.area();
//		s.print();

		Shape[] s = new Shape[3];
		s[0] = new Rect(4, 5); 
		s[1] = new Circle(5);
		s[2] = new Tri(4, 5);

		for (Shape temp : s) {
			temp.area();
			temp.print();

			
			
			
			
		Drawable[] a = new Drawable[3];  
		a[0] = new Rect(4, 5);	//자식타입이 부모타입으로 이동
		a[1] = new Circle(5);
		a[2] = new Tri(4, 5);

		for (Drawable drw : a) {
			drw.draw();
			if(drw instanceof Rect) {   // instanceof -> 있냐,없냐 
			((Rect)drw).area(); //부모 타입을 자식 타입으로 강제형 변환
			}else if(drw instanceof Circle) {
				((Circle)drw).area();
			}else if(drw instanceof Tri) {
				((Tri)drw).area();
			}
			if(drw instanceof Movable) {
				((Movable)drw).move();
				
			}
		}
	}

	}

}
