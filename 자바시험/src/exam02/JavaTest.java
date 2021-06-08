package exam02;

public class JavaTest {
	public static void main(String[] args) {
		int nam = 0;
		int yeo = 0;
		int ten =0;
		int twe=0;
		int thr=0;
		int four=0;
		String[] arr = { "010102-2", "991012-1", "960304-1", "881012-2", "040403-1" };

		for (int i = 0; i < arr.length; i++) {
			int b = Integer.parseInt(arr[i].substring(7));
			if (b == 1) {
				nam += 1;
			} else {
				yeo += 1;
			}
		}System.out.println("남:"+nam+" 여:"+yeo);

		for (int i = 0; i < arr.length; i++) {
			int a = Integer.parseInt(arr[i].substring(0, 2));
			if (a < 21) {
				a += 2000;
			} else {
				a += 1900;
			}
			if (2021 - a + 1 >= 40) {
				four+=1;
			}else if(2021 -a +1>=30) {
				thr+=1;
			}else if(2021-a +1>=20) {
				twe+=1;
			}else if(2021-a +1>=10) {
				ten+=1;
			}
		}System.out.println("10대:"+ten+" 20대:"+twe+" 30대:"+thr+" 40대:"+four);

	}

}
