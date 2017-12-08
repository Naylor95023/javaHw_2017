package HomeWork_Extend;

import java.util.GregorianCalendar;

class whichDay{
	int _n;
	int _countY;
	int _month, _day, _hour, _min, _s;
	whichDay(int n, int conuntY){
		_n = n;
		_countY = conuntY;
		countDate();
		monthDate();
	}
	void countDate(){
		_day = _n / ( 24* 60 * 60);
		_n %= (24 * 60 * 60);
		_hour = _n / (60 * 60);
		_n %= (60 * 60);
		_min = _n / 60;
		_s = _n % 60;
	}
	void monthDate(){
		int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31,
				30, 31, 30, 31};
		GregorianCalendar gc = new GregorianCalendar();
		if(gc.isLeapYear(1970 + _countY))days[2] = 29;
		for(int i = 0; i < 13; i++){
			if(_day < days[i]) {
				_month  = i;
				break;
			}
			else _day -= days[i];
		}_day++;
		
	}
	void getDate(){
		System.out.println("第" + (1970 + _countY) + "年");
		System.out.println(_month + "月" + _day + "日"  + _hour + "時" + _min + "分" + _s + "秒");
	}
	
}


public class ex01 {

	public static void main(String[] args) {
		int n = 2147483647;
		int DAY_S = 24 * 60 * 60;
		int YEAR_S = 365 * DAY_S;
		int startY = 1970;
		int countY = 0;
		GregorianCalendar gc = new GregorianCalendar(); 
		
		while (n > YEAR_S){
			countY++;
			if(gc.isLeapYear(startY + countY))
				n -= (YEAR_S + DAY_S);
			else n -= YEAR_S;
		}
		whichDay wd = new whichDay(n, countY);
		wd.getDate();
		
		

	}

}
