package co.yedam.test;

import java.util.Arrays;

/* 기본 데이터형 8타입은 기본값은 0으로 초기화
 * 참조 변수(String,[])은 null로 초기값이 정해짐.
 *
 */
public class FieldInitValue {
	
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	boolean bool;
	char c;
	String str;
	int[] arr;
	
	
	FieldInitValue(int in, double di){
		i = in;
		d =	di;	
		
	}
	
	@Override
	public String toString() {
		return "FiledInitValue [b=" + b + ", s=" + s + ", i=" + i + ", l=" + l + ", f=" + f + ", d=" + d + ", bool="
				+ bool + ", c=" + c + ", str=" + str + ", arr=" + Arrays.toString(arr) + "]";
}
	}
