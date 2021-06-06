package 클래스;

public class StringEqual {

	public static void main(String[] args) {
		String s1 = "hello";					//상수
		String s2 = "hello";				
		
		String s3 = new String("hello");		//힙
		String s4= new String("hello");
		
		System.out.println(s1==s2);
		System.out.println(s3==s4);
		System.out.println(s1==s3);
		System.out.println("------------");
		System.out.println(s1.equals(s3));
		System.out.println(s3.equals(s4));
		
		
		//String을 추가 변경 할 일 있으면 String 보다 StringBuffer를 사용해라
		//비교할때 (sb.toString().equals());
		StringBuffer sb = new StringBuffer("hello world");
		sb.insert(5, "!!!");
		System.out.println(sb.toString());
		sb.replace(0,5,"hi");
		System.out.println(sb.toString());
		
		
		

	}

}
