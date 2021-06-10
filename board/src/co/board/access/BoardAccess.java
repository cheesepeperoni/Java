package co.board.access;

import java.util.ArrayList;

import co.board.model.Board;

public interface BoardAccess {
	//등록
	public void  insert(Board board);
	
	//수정
	public void  update(Board board);
	
	//삭제
	public void delete(String id);
	
	//전체리스트
	public ArrayList<Board> selectAll();
	
	//한건조회
	public Board selectOne(String id);
	
}
