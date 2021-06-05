package pkg.friend;

import pkg.Friend;

public class AppMain {

	public static void main(String[] args) {
		//FriendAccess manager = BeanFactory.getBean(FriendAccess.class);	
		//FriendAccess manager = new FriendManager();
		//FriendAccess manager = new FriendList();
		
		//manager.selectAll();
		
		Friend f = new CompanyFriend("회사","백피비","7979","사장");
		f.print();
		Friend d = new SchoolFriend("프렌즈","백피비","9797","12월24일생");
		d.print();
		
		//다형성 (상속받고 오버라이딩)
		//1. 부모타입의 참조변수가 자식객체를 참조가능
		//2. 메서드 실행화면 참조 대상이 메서드가 호출되므로 결과가 다르다
		FriendManager manager2 = new FriendManager();
		for(Friend fr : manager2.friends){
			if(fr instanceof CompanyFriend)
			fr.print();
		}
	}

}
