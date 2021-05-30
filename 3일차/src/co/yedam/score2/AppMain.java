package co.yedam.score2;

public class AppMain {

	public static void main(String[] args) {
		ScoreArr2App score = new ScoreArr2App();
		// score.arr.length ==>3
		
		for (int i = 0; i < score.arr.length; i++) {
			System.out.printf("%s번 학생의 %d과목의 총점 : %d\n"
					,i+1,score.getSbjCnt(i),score.stdTotal(i));
		}
//		score.print();
	}

}
