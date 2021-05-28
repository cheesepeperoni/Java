package co.yedam.star;

public class StarApp {
	
	//삼각형 출력
	void draw(int cnt) {
		for(int i=1; i<=cnt; i++) {
			System.out.print(pad('#',i));
		}
	}
	
	void drawInvert(int cnt){
		for (int i=1; i<=cnt; i++) {
			System.out.println(pad('*',cnt+1-i));
		}
		
	}
	//이등변 삼각형
	void drawEq(int cnt) {
		for (int i=1; i<=cnt; i++) {
			System.out.println(pad(' ',cnt-i); //공백
			System.out.println(pad('*',i*2);
			
		}
		
		
		
	}
	//"*"*3
	//(*,10) ----->"*******" 
	String pad(char s , int cnt) {
		String result ="";
		for(int i=0; i<cnt; i++) {
			result = result+s;
	 }	return result;
	
	}
}




