package pkg;

public class MemberInfoMain {
	public static void main(String[] args) {
		MemberInfo member1 = MemberInfo.getInstance();// new MemberInfo();
		member1.names[0] = "피비";
		
		MemberInfo member2 =MemberInfo.getInstance(); // new MemberInfo();
		member2.names[1] = "조이";
		
		MemberInfo member3 =MemberInfo.getInstance(); // new MemberInfo();
		member3.names[2] = "사샤";
		
		
		member1.print();
//		member2.print();
//		member3.print();
	}
}