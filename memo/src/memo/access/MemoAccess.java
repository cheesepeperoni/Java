package memo.access;

import java.util.ArrayList;

public interface MemoAccess {
	String model="me";
	
	
	//메모 등록
	public void insert(Memo memo);
	
	//메모 수정
	public void update(Memo memo);
	
	//메모 삭제
	public void delete(String m);
	
	//메모 전체조회
	public ArrayList<Memo> selectAll();
	
	//날짜 검색
	public Memo SelectNal(String m);
	
	//내용검색
	public Memo findContents(String n);
	
	
	
	
	
	
	
	
}
