package co.board.access;

import java.util.ArrayList;

import co.board.model.Board;

public interface BoardAccess {
	//등록
	public void  insert(Board board);
	
	//수정
	public void  update(Board board);
	
	//삭제
	public void delete(int id);
	
	//전체리스트
	public ArrayList<Board> selectAll();
	
	//한건조회
	public Board selectOne(int id);
	
	//댓글작성
	public void comment(Board board);
	
	//댓글조회
	public ArrayList<Board> searchCom(int id);
	
	//로그인
	public boolean login(String loginId, String loginPw);
	
	//권한 
	public boolean userKey(int bid ,String uid);
	
	
}
