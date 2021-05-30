package co.yedam.star;

public class AppMain {

	public static void main(String[] args) {
		StarApp star = new StarApp();
//		star.draw(8);
//		System.out.println();
//		star.drawInvert(9);
//		star.drawEq(8);
//		star.drawTr(1, 8);
//		System.out.println();
		star.drawDia(8);

	
		
		star.drawTitle("나무",100);
		star.drawEq(4);
		star.drawEq_2(2,6);
		star.drawEq_3(4,8);
		star.drawRect(4);
		
		
	}

}