package pkg.friend;

import java.util.List; 

import pkg.Friend;
/**
 * 인터페이스 : 상수필드 + 추상메서드
 * 상수필드 : public static final
 * 메서드: public abstract
 */
//친구관리 개발 시 개발 표준
public interface FriendAccess {
    String model ="ddd";		//public static 앞에 얘가 생략된것
	//등록
	public void insert(Friend friend);
	
	
	//수정
	public void update(Friend friend);
	
	
	//삭제
	public void delete(String name);
	
	
	
	//전체조회
	public void selectAll();
	

	//단건조회
	public Friend selectOne(String name);
}
