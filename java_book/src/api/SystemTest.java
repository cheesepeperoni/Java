package api;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Field;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;



public class SystemTest {

	public static void main(String[] args) throws URISyntaxException, FileNotFoundException {
		System.out.println(System.currentTimeMillis());
		// 파일명 rename, 실행시간

		// System.exit(0); //0이면 비정상, 0이 아니면 정상실행

		Map<String, String> map = System.getenv();
		System.out.println(map.get("JAVA_HOME"));
		Iterator<String> iter = map.keySet().iterator();
		System.out.println("----------------------------");
		while (iter.hasNext()) {
			String key = iter.next();
			System.out.println(key + ":" + map.get(key));
		}
		//System.gc();
		Field[] fields = Book.class.getDeclaredFields();
		for(Field f:fields) {
			System.out.println(f.getName()+":"+f.getType());
		}
		URI uri =Book.class.getResource("/resources/menu.txt").toURI();   //상대경로
		Scanner scanner= new Scanner(new File(uri));
		System.out.println(scanner.next());
	}

}
