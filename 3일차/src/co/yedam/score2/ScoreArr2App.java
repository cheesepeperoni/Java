package co.yedam.score2;

public class ScoreArr2App {
				//국  영  수
	int[][]arr ={{100,90,80},
			     {10,20,30},
		         {50,50,50},
		         {30,30,30} };
	 
	void print() {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length ; j++) {
				System.out.print(arr[j][i]+"");
			}
			System.out.println();
		}
	}
	// 해당 학생의 과목수
	int getSbjCnt(int no) {
		return arr[no].length;
	}
	//입력한 번호의 한 학생의 총점
	int stdTotal(int no) {
		int result = 0;
		for(int i=0 ; i<arr[no].length; i++) {
			result += arr[no][i];//+ arr[no][0] + arr[no][1] +arr[no][2];
		}
		return result;
	}
}	         
