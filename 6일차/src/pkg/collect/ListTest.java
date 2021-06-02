package pkg.collect;

//import java.util.ArrayList;
import java.util.LinkedList;
import pkg.Friend;
import pkg.friend.CompanyFriend;
import pkg.friend.SchoolFriend;

public class ListTest {

	public static void main(String[] args) {
		LinkedList<Friend> list = new LinkedList<Friend>();
		list.add(new Friend("에스테틱", "핍", "1111"));
		list.add(0, new CompanyFriend("랄프로렌", "레이첼", "1211"));
		list.add(new SchoolFriend("신명", "다운", "1143"));
		// System.out.println(list);

		// 전체조회
		for (Friend f : list) {
			System.out.println(f.getName());

		}
		System.out.println("==========");

		// 삭제
		list.remove(0);
		for (Friend f : list) {
			System.out.println(f.getName());
		}

		Friend fr = list.get(0);
		System.out.println("첫번째 이름:" + fr.getName());

		// 마지막이름: size()
		System.out.println("마지막 이름:" + list.get(list.size() - 1).getName());
		
		// 수정
		list.set(1, new Friend("중학교", "사샤", "5555"));
		for (Friend f : list) {
			System.out.println(f.getName());
		}
	}

}
