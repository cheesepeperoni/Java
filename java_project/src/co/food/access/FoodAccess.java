package co.food.access;

import java.util.ArrayList;

import co.food.model.Food;

public interface FoodAccess {
	// 재료 등록
	public void insert(Food food);

	// 재료 수정
	public void update(Food food);

	// 재료 삭제
	public void delete(int number);

	// 전체조회
	public ArrayList<Food> foodAll();
	
	// 직원 전체조회
	public ArrayList<Food> workerAll();

	// 재료로 조회
	public Food foodOne(String food);

	// 로그인
	public boolean login(String loginId, String loginPw);

	// 직원 회원가입
	public void signUp(String h, String hp);

	// 직원 회원탈퇴
	public boolean deleteAccount(String byeId, String byePw);
	
	//수량 체크
	public int check(String food);
	
	//수량 수정
	public void checkUpdate(Food food);
}
