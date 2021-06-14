package co.food.model;

public class Food {
	// 음식점 재고관리
	protected int number;
	protected String loginId; // 로그인 아이디
	protected String loginPw; // 로그인 패스워드
	protected String food; // 음식
	protected String content; // 부가설명
	protected String date; // 유효기간

	public Food() {
	}
	
	public Food(String loginId, String loginPw) {
		super();
		this.loginId=loginId;
		this.loginPw=loginPw;
	}
	public Food(String food, String content, String date) {
		super();
		this.food = food;
		this.content = content;
		this.date = date;

	}
	public Food(int number, String food, String content, String date) {
		super();
		this.number = number;
		this.food = food;
		this.content = content;
		this.date = date;

	}

	public Food(int number, String loginId, String loginPw, String food, String content, String date) {
		super();
		this.number = number;
		this.loginId = loginId;
		this.loginPw = loginPw;
		this.food = food;
		this.content = content;
		this.date = date;

	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getLoginPw() {
		return loginPw;
	}

	public void setLoginPw(String loginPw) {
		this.loginPw = loginPw;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	
	@Override
	public String toString() {
		return "│ NUMBER :" + number + " │ FOOD :" + food
				+ " │ CONTENT :" + content + " │ EXPIRY DATE :" + date+" │";
	}

}
