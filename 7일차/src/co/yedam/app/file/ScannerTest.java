package co.yedam.app.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) throws FileNotFoundException {
		String str = "1 a hi";
		Scanner scanner = new Scanner(new FileInputStream("d:/temp/f.dat")); // 파일로 부터 읽어서 출력
		// int a = scanner.nextInt();
		while (true) {
			try {
				String a = scanner.next();
				System.out.println(a);
			} catch (Exception e) {
				break;
			}

		}

	}
}
