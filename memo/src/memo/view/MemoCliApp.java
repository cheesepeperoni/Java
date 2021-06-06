package memo.view;

import java.util.List;

import co.memo.util.ScannerUtil;
import memo.access.MemoList;
import memo.model.Memo;

public class MemoCliApp {
	MemoList memoList = new MemoList();

	public void start() {
		int menunum;
		do {
			menuTitle();
			menunum = ScannerUtil.readInt("입력하세요");
			switch(menunum) {
			case 1: insert(); break;
			case 2: update(); break;
			case 3: delete(); break;
			case 4: selectAll(); break;
			case 5: selectNal(); break;
			case 6: findContent(); break;
			
			}
		}while(menunum != 0);
		System.out.println("종료되었습니다");
	}
	
	private void selectNal() {
		String m = ScannerUtil.readStr("날짜를 검색하세요");
		Memo memo = memoList.selectNal(m);
		System.out.println(memo.getContent());
	}
	
	private void findContent() {
		String n = ScannerUtil.readStr("내용을 검색하세요");
		Memo memo = memoList.findContent(n);
		System.out.println(memo);
	}
	
	
	private void insert() {
		Memo memo = ScannerUtil.readMemo();
		memoList.insert(memo);
		
	}
	
	private void update() {
		Memo memo = new Memo();
		memo.setDate(ScannerUtil.readStr("날짜를 입력하세요"));
		memo.setContent(ScannerUtil.readStr("수정하실 내용을 입력하세요"));
		memoList.update(memo);
	}
	private void delete() {
		String m = ScannerUtil.readStr("삭제하실 날짜를 입력하세요");
		memoList.delete(m);
		
	}
	private void selectAll() {
		List<Memo> list = memoList.selectAll();
		for (Memo memo :list) {
			System.out.println(memo);
			
		}
	}
	// 메뉴 출력
	public void menuTitle() {
		System.out.println("==메모장==");
		System.out.println("1 메모등록");
		System.out.println("2 메모수정");
		System.out.println("3 메모삭제");
		System.out.println("4 메모전체조회");
		System.out.println("5 날짜검색");
		System.out.println("6 내용검색");
		System.out.println("0 종료");
	}
	



}
