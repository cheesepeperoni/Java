package co.food.access;

import java.util.ArrayList;

import co.food.model.Food;

public interface FoodAccess {
	// 음식 등록
	public void insert(Food food);

	// 음식 수정
	public void update(Food food);

	// 음식 삭제
	public void delete(int number);

	// 음식리스트
	public ArrayList<Food> foodAll();

	// 음식으로 조회
	public Food foodOne(String food);

	// 로그인
	public boolean login(String loginId, String loginPw);

	// 직원 회원가입
	public void signUp(String h, String hp);
	
	// 직원 회원탈퇴
	public boolean unSubscribe(String byeId,String byePw);
}
