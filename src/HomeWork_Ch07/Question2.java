package HomeWork_Ch07;

import java.util.Calendar;


//���o�ثe����ƭȡA�]�wseason�ƭ�
class StaticCodeBlock {
	static public String SEASON = "�V��";
	static {
		Calendar c = Calendar.getInstance();
		System.out.println(c.getTime().toString());
		int month = c.get(Calendar.MONTH);
		if (month < 6 && month > 2) SEASON = "�K��";
		else if (month < 9 && month > 5) SEASON = "�L��";
		else if (month < 12 && month > 8) SEASON = "���";
	}
}

//�I�s�R�A�ܼ�
public class Question2 {
	public static void main(String[] args) {
		System.out.println(StaticCodeBlock.SEASON);
	}
}
