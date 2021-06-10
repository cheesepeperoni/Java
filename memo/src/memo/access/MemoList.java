package memo.access;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

import memo.model.Memo;

public class MemoList implements MemoAccess {
	ArrayList<Memo> memos;

	String path = "d:/temp/memo.txt";

	// 오픈
	public void open() {
		try {
			Scanner scanner = new Scanner(new File(path));
			while (true) {
				if (!scanner.hasNext())
					break;
				String str = scanner.nextLine();
				String[] arr = str.split(",");
				memos.add(new Memo(arr[0],arr[1]));
			}
			scanner.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 메모 리스트
	public MemoList() {
		memos = new ArrayList<Memo>();
		open();

	}

	// 메모 등록
	public void insert(Memo memo) {
		memos.add(memo);
		save();
	}

	public void save() {
		try {
			BufferedWriter cn = new BufferedWriter(new FileWriter(path));
			for(Memo o: memos) {
				cn.write(String.format("%s,%s\n",o.getDate(),o.getContent()));
			}
			cn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	// 메모 등록
	public void update(Memo memo) {
		for (Memo o : memos) {
			if (o.getDate().equals(memo.getDate())) {
				o.setContent(memo.getContent());
				save();
			}
		}
	}
	// 메모 삭제
	public void delete(String m) {
		for (Memo o : memos) {
			if (o.getDate().equals(m)) {
				memos.remove(o);
				save();
				break;
			}
		}
	}

	public ArrayList<Memo> selectAll() {
		return memos;

	}

	public Memo selectNal(String m) {
		for (Memo o : memos) {
			if (o.getDate().equals(m)) {
				return o;
			}
		}
		return null;
	}

	public Memo findContent(String n) {
		for (Memo o : memos) {
			if (o.getContent().contains(n)) { // contains
				return o;
			}
		}
		return null;
	}
}
