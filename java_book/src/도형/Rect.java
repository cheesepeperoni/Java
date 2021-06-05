package 도형;

public class Rect extends Shape implements Drawable, Movable {
	int h;

	public Rect(int w, int h) {
		this.w = w;
		this.h = h;

	}

	public void area() {
		result = w*h;
	}

	@Override
	public void draw() {
		System.out.println();
		
	}

	@Override
	public void move() {
		System.out.println();
		
	}
}