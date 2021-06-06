package phoebeTest;

import java.util.Scanner;
public class Alphabet10809 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String s = scanner.next();

		for (char i = 'a'; i < 'z'; i++) {
			 System.out.print(s.indexOf(i) + " ");
		}
					// a b c d e f g h i j k l m n o p q r s t u v w x y z
	}

}
