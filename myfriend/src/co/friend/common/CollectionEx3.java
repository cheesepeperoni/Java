package co.friend.common;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import co.friend.model.Friend;

public class CollectionEx3 {
	public static void main(String[] args) {
		Map<String, Friend> map = new HashMap<>(); // Map<key,value>
		map.put("반장", new Friend("1반", "홍길동", "1111")); // key에 들어가는건 중복된 값 들어가면 안됨 (박길동으로 바꿔버림)
		map.put("평범", new Friend("1반", "홍평범", "2222"));
		map.put("선생님", new Friend("1반", "홍두깨", "3333"));
		map.put("반장", new Friend("1반", "박길동", "1212"));

		// System.out.println(map.get("선생님"));

		Set<String> keys = map.keySet();			// key 값만 가져오는 방식
		Iterator<String> iter = keys.iterator();
		while (iter.hasNext()) {
			String key = iter.next();
			Friend val = map.get(key);
			System.out.println("key:" + key + ", value:" + val.toString());
		}
		System.out.println("=======================");
		// Friend : key, Integer: value
		Map<Friend, Integer> scores = new HashMap<>();		//Entry 타입으로 가져오는 방식
		scores.put(new Friend("1반", "홍길동", "1111"), 80);
		scores.put(new Friend("1반", "정인영", "1111"), 90);
		scores.put(new Friend("1반", "김효진", "1111"), 89);
		scores.put(new Friend("1반", "윤지민", "1111"), 91);
		scores.put(new Friend("1반", "홍길동", "1111"), 85);

		Set<Entry<Friend, Integer>> ent = scores.entrySet(); // Set<Map.Entry>를 줄인것
		Iterator<Entry<Friend, Integer>> eiter = ent.iterator();
		while (eiter.hasNext()) {
			Entry<Friend, Integer> e = eiter.next();
			System.out.println(e.getKey() + "," + e.getValue());
		}

	}

}
