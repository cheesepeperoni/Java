package 배열;

public class 배열초기화 {
/*
 * 배열: 크기고정
 * 순차적으로 데이터를 저장하고 읽는 용도
 * 추가/삭제가 번거로움
 */
	
	
	
	public static void main(String[] args) {
		//1차원 배열       *리스트와 배열은 다름
		//배열 선언
		int[] a;	//객체 -> new 힙 메모리 할당을 해야함
		a=new int[10];   // (최대 10개까지) 정해줘야함
		
		//배열값을 초기화 시킴
		a[0] = 10; //0~9까지 10개
		a[1] = 20;	//초기값은 0
		a[2] = 100;
		a[3] = 50;
		
		//삭제(인덱스 다음부터 앞으로 이동)
		for(int i=2;i<a.length;i++) {
			a[i-1]=a[i];
		}
		
		//배열 출력_ length는 []안의 길이
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		//배열 선언과 초기화를 한꺼번에
		int[]b = {100,200,300};		//new int[3]{100,200,300}
			System.out.println("크기 "+ b.length);
		
		
		
		
		
		
		
	}

}
