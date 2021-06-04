package memo.access;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

import co.friend.model.Friend;
import memo.model.Memo;

public class MemoList implements MemoAccess {
	ArrayList<Memo> memos;

	String path = "d:/temp/memo.txt";

	// 오픈
	public void open() {
		try {
			Scanner scanner = new Scanner(new File(path));
			while(true) {
				if(! scanner.hasNext())
					break;
				String str = scanner.next();
				String[] arr = str.split(",");
				friends.add(new Friend(arr[0], arr[1]));
				
			}scanner.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	// 메모 리스트
	public MemoList() {
		memos = new MemoList<Memo>();
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
				cn.write(String.format("%s, %s\n",o.getDate(),o.getContent()))
			}
			cn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	//추가
	public void update(Memo memo) {
		for (memo o : memos) {
			if (o.getdate().equals(date.getContent)) {
				memos.remove(o);
				save();
			}
		}
	}

	public void delete(String date) {
		for (Memo o : memos) {
			if(o.getDate().equals(date)) {
				memos.remove(o);
				save();
				break;
			}
		}
	}
	
	public ArrayList<Memo> selectAll(){
		return memos;
		
	}
	
	public Memo MemoNal(String date) {
		for(Memo o: memos) {
			if(o.getDate().equals(date)) {
				return o;
			}
		}return null;
	}
	
}
