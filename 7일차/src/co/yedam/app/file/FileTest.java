package co.yedam.app.file;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void filecreate() throws IOException {

		// 파일 생성
		File file = new File("d:/temp/diary.txt");
		boolean result = file.createNewFile();
		System.out.println(result);
	}

	public static void main(String[] args) throws IOException {
		// file
		//makefolder();
		// fileInfo();
		folderlist(); // 폴더목록
	}

	private static void folderlist() {
		File file = new File("d:/temp");
		if (file.isDirectory()) {
			File[] list = file.listFiles();
			for (File f : list) {
				if (StringUtil.getExtention(f.getName()).equals("png")) {
					System.out.println(f.getName());
					FileUtil.copy(f.getAbsolutePath(), "d:/temp/images/" + f.getName());
				}
			}
		}
	}

	private static void makefolder() {			//폴더만들기
		File file = new File("d:/temp/images");
		file.mkdir();

	}

	public static void fileInfo() {
		File file = new File("d:/temp/images.png");
		System.out.println("파일 크기:" + file.length());
		System.out.println("파일 이름:" + file.getName());

	}

}