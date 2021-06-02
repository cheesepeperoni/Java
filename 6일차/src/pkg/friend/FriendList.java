package pkg.friend;

import java.util.ArrayList;
import java.util.List;

import pkg.Friend;

public class FriendList implements FriendAccess {
	ArrayList<Friend> friends;
	
	
	public FriendList() {
		friends = new ArrayList<Friend>();
	}

	@Override      //abstract 생략된것
 	public void insert(Friend friend) {
		friends.add(friend);
		
	}

	@Override
	public void update(Friend friend) {
		System.out.println("FriendList");
		
	}

	@Override
	public void delate(String name) {
		
		
	}

	@Override
	public void selectAll() {

	}

	@Override
	public Friend selectOne(String name) {
		for(Friend f : friends) {
			if(f.getName().equals(name)) { //contains
				return f;
			}
		}
		return null;
	}
	
}
