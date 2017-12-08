package HomeWork_Ch03;

/*
 *計算256559是幾天幾小時幾分幾秒 
 */

public class Question2 {
	public static void main(String[] args) {
		int question_s = 256559;
		//算各單位秒數
		int min_s = 60;
		int hour_s = min_s * min_s;
		int day_s = hour_s * 24;
		//取餘數，除秒數
		int day = question_s/day_s;
		int hour = (question_s %= day_s)/hour_s;
		int min = (question_s %= hour_s)/min_s;
		int s = (question_s %= min_s);
		//Print
		System.out.print(day + "天");
		System.out.print(hour + "小時");
		System.out.print(min + "分");
		System.out.print(s + "秒");
		
		
	}
}
