package pkg;
/*
 * 정적메서드 안에서는 정적필드만 접근할 수 있음
 * 접근제어자 : private > default >  protected             > public
 * 			  클래스 내부/같은패키지/(다른패키지도 가능하지만)상속
 */
public class DateUtil {
	static String date ="20210610";
	public static String curDate() {
		return "20210602"; // or date로 리턴 가능(static일때)
	}					   // static 이 아니고 인스턴스 필드 일 때는
						   // ____  = new ____ 하고 
}
