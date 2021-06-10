package co.board.view;

import java.util.List;
import java.util.Scanner;

import co.board.Util.ScannerUtil;
import co.board.access.BoardDAO;
import co.board.model.Board;

public class BoardApp {
	BoardDAO boardList = new BoardDAO();
	Scanner scn = new Scanner(System.in);
	public void start() {
		int menunum;
		do {
			menuTitle();
			menunum = ScannerUtil.readInt("입력");
			switch (menunum) {
			case 1:selectAll();break;
			case 2:insert();break;
			case 3:update();break;
			case 4:delete();break;
			case 5:selectOne();break;			
			}
		} while (menunum != 0);
		System.out.println("《  종료되었습니다  》");
	}
	private void insert() {
		System.out.print("제목>");
		String d = ScannerUtil.readStr();
		System.out.print("작성자>");
		String o = ScannerUtil.readStr();
		System.out.print("내용>");
		String e = ScannerUtil.readStr();
		Board board = new Board(d,o,e);
		boardList.insert(board);
	}
	private void update() {
		Board board = new Board();
		System.out.print("글 번호를 입력하세요>");
		board.setId(scn.next());
		System.out.print("수정할 내용을 입력하세요>");
		board.setContent(scn.next());
		boardList.update(board);
	}
	private void delete() {
		System.out.print("삭제할 글 번호를 입력하세요>");
		String id = scn.next();
		boardList.delete(id);
	}
	private void selectAll() {
		List<Board> list = boardList.selectAll();
		for(Board board : list) {
			System.out.println(board);
		}
	}
	private void selectOne() {
		System.out.print("글 번호>");
		String a=ScannerUtil.readStr();
		Board board = boardList.selectOne(a);
		System.out.println(board);
	}
	public void menuTitle() {
		System.out.println("♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡");
		System.out.println("。    1 전체조회       。");
		System.out.println("。    2 등록          。");
		System.out.println("。    3 수정          。");
		System.out.println("。    4 삭제          。");
		System.out.println("。    5 글번호로 조회   。");
		System.out.println("。    0 종료          。");
		System.out.println("♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡");
		

	}

	
}
