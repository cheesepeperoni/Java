package wrapper;

import java.util.ArrayList;
//1. 기본 데이터형을 객체화
//2. 타입변환
public class WrapperTest {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(new Integer(10));
		list.add(new Integer("10"));//박싱
		list.add(100);				//Integer객체로 오토 박싱
		
		Integer a =100;
		int b = a.intValue();		//언박싱
		b=a;						//오토 언박싱(위에 처럼 해도되는데 <Integer>해줬으니까 바로 써도됨)
		
		//int -> String
		String s = Integer.toString(a);
	}
}
