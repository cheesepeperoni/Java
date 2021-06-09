package co.friend.common;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import co.friend.access.FriendDAO;

public class CollectionEx4 {

	public static void main(String[] args) {
		//이름과 연락처를 출력하세요
		FriendDAO dao = new FriendDAO();
		Map<String,String>map=dao.getNameTel();
		Set<String> keys = map.keySet();			// key 값만 가져오는 방식
		Iterator<String> iter = keys.iterator();
		while (iter.hasNext()) {
			String key = iter.next();
			String val = map.get(key);
			System.out.println("name:" + key + ", tel:" + val.toString());
		}
	}

}
