package 클래스;

public class MemberEqualTest {

	public static void main(String[] args) {
		Member m1 = new Member("Park","박기자","1111",20);
		//Member m2 = new Member("Park","박기자","2222",25);   얘는 true
		Member m2 = new Member(new String("park"),"박기자","2222",25);	//얘는 false
		
		System.out.println(m1==m2);
		System.out.println(m1.equals(m2));
		//Member의 equals 메서드 오버라이딩: id와 name을 비교
	
		
		

	}

}
