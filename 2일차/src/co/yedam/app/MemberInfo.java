package co.yedam.app;

import java.util.Scanner;

public class MemberInfo {
	
	String name;   //이름
	String id;	   //주민번호
	String tel;	   //전화번호
	float weight;
	float height;
	double result = 0;
	String s = "";
	
	Scanner scanner = new Scanner(System.in);
	//키, 몸무게 bmi=몸무게/신장*신장
	void heightWeightInput() {
		System.out.println("몸무게를 입력하세요:");
		weight = scanner.nextFloat();
		System.out.println("키를 입력하세요:");
		height = scanner.nextFloat();
		
	}
	//코드 추가
	String bmi() {
		//코드 추가
	    result = weight/(height/100*height/100);
	    //코드 추가
	    //산출된 값이 18.5 이하면 저체중,
	    //18.5~23은 정상,
	    //23~25 과체중
	    //25~30은 비만,
	    //30 이상은 고도비만
	    if(result>=18.5) {
	    	 s ="저체중";

	   }else if(result<23){
		    s ="정상";
	    	
	    }else if(result<25) {
	    	s="과체중";
	    }
	    else {
	    	s="고도비만";
	    }

		return s;
		}
	
	
	void input() {
		//코드 작성
		System.out.println("1. 이름");
		name = scanner.next();
		System.out.println("2:주민 번호 앞자리");
		id = scanner.next();
		System.out.println("3:전화번호");
		tel =scanner.next();
		
 	}
	void print() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(tel);
		
		
		
	}
}