package pkg.friend;

import pkg.Friend;

public class CompanyFriend extends Friend {
	String duty;
	
	
	public CompanyFriend() {}
	public CompanyFriend(String gubun, String name, String tel) {
		super(gubun, name, tel);
	}
	public CompanyFriend(String gubun, String name, String tel, String duty) {
		super(gubun, name, tel);
		this.duty = duty;
	}
	@Override 
	public void print() {
		//super.print();
		System.out.printf("회사 친구 : %20s %20s %20s %20s\n",gubun,name,tel,duty);
		System.out.println("duty:"+duty);
	}

	
	
	
}
