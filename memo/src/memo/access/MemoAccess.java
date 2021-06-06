package memo.access;

import java.util.ArrayList;

import memo.model.Memo;

public interface MemoAccess {

	// 메모 등록
	public void insert(Memo memo);

	// 메모 수정
	public void update(Memo memo);

	// 메모 삭제 (날짜 검색해서 삭제하기)
	public void delete(String m);

	// 메모 전체조회
	public ArrayList<Memo> selectAll();

	// 날짜 검색
	public Memo selectNal(String m);

	// 내용검색
	public Memo findContent(String n);

}
