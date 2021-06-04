package co.yedam.app.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class FileSaveTest {

	public static void main(String[] args) {
		// byte:stream , char(2~3):reader
		try {
			BufferedReader isr = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter br = new BufferedWriter(new FileWriter("d:/temp/f.dat"));
			while(true) {					// 여러줄 쓰고 싶을때 , while 문 돌리기
			String c = isr.readLine();
			if(c == null) break;
			br.write(c);
			br.write("\n");			//ctrl z : 끄고 나가기
			
			}br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
