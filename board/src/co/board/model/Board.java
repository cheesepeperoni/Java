package co.board.model;

public class Board {
	// 글 번호 = id  == b_id
	protected int id;
	protected String title;
	protected String content;
	protected String writer;
	protected int parentId;
	protected String loginId;
	protected String loginPw;

	public Board() {
	}

	public Board(String title, String content) {
		super();
		this.title = title;
		this.content = content;
	}

	public Board(String title,String content ,String writer) {
		super();
		this.title = title;
		this.content = content;
		this.writer = writer;
	}

	public Board(int id, String title, String content, String writer) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.writer = writer;
	}

	public Board(String title, String content, String writer, int parentId) {
		super();
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.parentId = parentId;

	}

	public int getParentId() {
		return parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getLoginpw() {
		return loginPw;
	}

	public void setLoginpw(String loginpw) {
		this.loginPw = loginpw;
	}

	public String show() {
		return "Board [content=" + content +  "]";
	}
	
	@Override
	public String toString() {
		return "Board [글번호:" + id + ", title=" + title + ", content=" + content + ", writer=" + writer + ", parentId="
				+ parentId + "]";
	}

	

}
