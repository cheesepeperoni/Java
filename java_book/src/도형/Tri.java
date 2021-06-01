package 도형;

public class Tri extends Shape implements Drawable{
	int h;

	public Tri(int w, int h) {
		this.w = w; //super(w);로 해도됨 (부모생성자에서 불러오기)
		this.h = h;
	}

	public void area() {
		result = w*h/2;

	}

	@Override
	public void draw() {
		System.out.println();
		
	}
}
