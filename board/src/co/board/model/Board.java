package co.board.model;

public class Board {
	//글 번호 = id
	protected String id;
	protected String title;
	protected String content;
	protected String writer;

	public Board() {
	}

	public Board(String title, String content) {
		super();
		this.title=title;
		this.content=content;
	}
	public Board(String title, String writer, String content) {
		super();
		this.title = title;
		this.writer = writer;
		this.content = content;
	}

	public Board(String id, String title, String content, String writer) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.writer = writer;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	@Override
	public String toString() {
		return "Board [id=" + id + ", title=" + title + ", content=" + content + ", writer=" + writer + "]";
	}

}
