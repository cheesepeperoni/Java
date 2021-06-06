package pkg.friend;

import java.util.List;

import pkg.Friend;

// 클래스 타입 여러개 있으면 public 은 하나만 됨
public class FriendManager implements FriendAccess {
	Friend[] friends = new Friend[5];

	public FriendManager() {
		friends[0] = new CompanyFriend("프렌즈 컴퍼니","피비","010-1234-333","사장");
		friends[1] = new SchoolFriend("프렌즈 요리 학교","모니카","010-9952-333","고등학생");
		friends[2] = new SchoolFriend("프렌즈 패션 학교","레이첼","010-2093-333","중학생");
		friends[3] = new CompanyFriend("센트럴 퍼크 컴퍼니","조이","010-2624-333","사원");
		friends[4] = new CompanyFriend("이름 모를 컴퍼니","챈들러","010-8822-333","팀장");
	}

	@Override
	public void insert(Friend friend) {
		System.out.println("FriendManage");

	}

	@Override
	public void update(Friend friend) {
		System.out.println("FriendManage");

	}

	@Override
	public void delete(Friend friend) {
		// TODO Auto-generated method stub

	}

	@Override
	public List selectAll() {
		System.out.println("FriendManage");
		return null;
	}

	@Override
	public Friend selectOne(Object key) {
		System.out.println("FriendManage");
		return null;
	}

}
