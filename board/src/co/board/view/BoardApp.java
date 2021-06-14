package co.board.view;

import java.util.List;
import java.util.Scanner;

import co.board.Util.ScannerUtil;
import co.board.access.BoardDAO;
import co.board.model.Board;

public class BoardApp {
	BoardDAO boardList = new BoardDAO();
	Scanner scanner = new Scanner(System.in);
    String uid;
    String upw;

	public void start() {
		int menunum;
		System.out.print("아이디를 입력하세요>");
		uid = scanner.next();
		System.out.print("비밀번호를 입력하세요>");
		upw = scanner.next();
		boolean b = boardList.login(uid, upw);
		if (b == true) {
			do {
				menuTitle();
				menunum = ScannerUtil.readInt("입력");
				switch (menunum) {
				case 1:selectAll();break;
				case 2:insert();break;
				case 3:update();break;
				case 4:delete();break;
				case 5:selectOne();break;
				case 6:comment();break;
				}
			} while (menunum != 0);
			System.out.println("《  종료되었습니다  》");
		} else {
			System.out.println("비밀번호가 틀렸습니다");
		}
	}

	private void insert() {
		System.out.print("제목>");
		String d = ScannerUtil.readStr();
		System.out.print("내용>");
		String e = ScannerUtil.readStr();
		System.out.print("작성자>");
		String w = ScannerUtil.readStr();
		Board board = new Board(d,e,w);
		boardList.insert(board);
	}

	private void update() {
		Board board = new Board();
		System.out.print("글 번호를 입력하세요>");
		board.setId(scanner.nextInt());
		System.out.print("수정할 내용을 입력하세요>");
		board.setContent(scanner.next());
		boardList.update(board);
	}

	private void delete() {	
		int id =ScannerUtil.readInt("삭제할 글 번호를 입력하세요>");
		boolean a = boardList.userKey(id, uid);
		if(a) {
			boardList.delete(id);			
		}else {
			System.out.println("<< 권한이 없습니다 >>");
			start();
		}
	}

	private void selectAll() {
		List<Board> list = boardList.selectAll();
		for (Board board : list) {
			System.out.println(board);
		}
	}

	// 게시글 조회 (본문+댓글 조회)
	private void selectOne() {
		int id = ScannerUtil.readInt("조회할 글 번호를 입력하시오");
		System.out.println(boardList.selectOne(id));
		System.out.println(boardList.searchCom(id));
	}

	// 댓글 작성
	private void comment() {
		System.out.print("조회할 글 번호를 입력하세요 > ");
		int id = scanner.nextInt();
		Board board = boardList.selectOne(id);
		System.out.println("댓글을 입력하세요");
		System.out.print("제목>");
		String d = ScannerUtil.readStr();
		System.out.print("내용>");
		String n = ScannerUtil.readStr();
		System.out.print("작성자>");
		String e = ScannerUtil.readStr();
		board = new Board(d, n , e, id);
		boardList.comment(board);
	}

	public void menuTitle() {
		System.out.println("♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡");
		System.out.println("。    1 전체조회       。");
		System.out.println("。    2 등록          。");
		System.out.println("。    3 수정          。");
		System.out.println("。    4 삭제          。");
		System.out.println("。    5 조회          。");
		System.out.println("。    6 댓글작성       。");
		System.out.println("。    0 종료          。");
		System.out.println("♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡");

	}

}
