package co.friend.view;

import java.util.List; 

import co.friend.Util.ScannerUtil;
import co.friend.access.FriendDAO;
import co.friend.model.Friend;

public class FriendCliApp {
//	FriendList friendList = new FriendList();
	FriendDAO friendList = new FriendDAO();
	public void start() {
		int menunum;
		do {
			menuTitle();
			menunum = ScannerUtil.readInt("<번호를 입력하세요>");
			switch (menunum) {
			case 1:insert();break;
			case 2:update();break;
			case 3:delete();break;
			case 4:selectAll();break;
			case 5:findName();break;
			case 6:findTel();break;
 
			}
		} while (menunum != 0);
		System.out.println("종료되었습니다");
	}

	private void findTel() {
		System.out.println("전화번로 검색>");
		String tel = ScannerUtil.readStr();
		Friend friend = friendList.findTel(tel);
		System.out.println(friend);

	}

	private void findName() {
		System.out.println("찾을이름>");
		String name = ScannerUtil.readStr();
		Friend friend = friendList.selectOne(name);
		System.out.println(friend);
	}

	private void insert() {
		Friend friend = ScannerUtil.readFriend();
		friendList.insert(friend);

	}

	private void update() {
		Friend friend = new Friend();
		System.out.print("이름:");
		friend.setName(ScannerUtil.readStr());
		System.out.print("전화번호:");
		friend.setTel(ScannerUtil.readStr());
		friendList.update(friend);

	}

	private void delete() {
		System.out.println("삭제할 이름>");
		String name = ScannerUtil.readStr();
		friendList.delete(name);

	}

	private void selectAll() {
		List<Friend> list = friendList.selectAll();
		for (Friend friend : list) {
			System.out.println(friend);
		}

	}

	// 메뉴 출력
	public void menuTitle() {
		System.out.println("==친구관리==");
		System.out.println("1 친구추가");
		System.out.println("2 친구수정");
		System.out.println("3 친구삭제");
		System.out.println("4 전체조회");
		System.out.println("5 이름으로 조회");
		System.out.println("6 전화번호 조회");
		System.out.println("0 종료");

	}

}
