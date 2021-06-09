package co.friend.common;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class CollectionEx {

	public static void main(String[] args) {
		List<String> list = null;
		list = new ArrayList<String>();
		list.add("현다운");
		list.add("진사샤");
		list.add("백피비");

		list.remove(0);
		System.out.println("<list>");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));

		}

		Set<String> set = new HashSet<>();
		set.add("백");
		set.add("진");
		set.add("권");
		set.add("이");
		
		System.out.println("<set>");
		Iterator<String>iter = set.iterator();
		while(iter.hasNext()) {				//hasNext로 중복값이 있는지 없는지 검사하고
			String value= iter.next();		//있으면 next로 가져와서 value값에 넣어준다
			System.out.println(value);
		}
	}

}
