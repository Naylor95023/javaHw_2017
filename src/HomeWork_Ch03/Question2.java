package HomeWork_Ch03;

/*
 *�p��256559�O�X�ѴX�p�ɴX���X�� 
 */

public class Question2 {
	public static void main(String[] args) {
		int question_s = 256559;
		//��U�����
		int min_s = 60;
		int hour_s = min_s * min_s;
		int day_s = hour_s * 24;
		//���l�ơA�����
		int day = question_s/day_s;
		int hour = (question_s %= day_s)/hour_s;
		int min = (question_s %= hour_s)/min_s;
		int s = (question_s %= min_s);
		//Print
		System.out.print(day + "��");
		System.out.print(hour + "�p��");
		System.out.print(min + "��");
		System.out.print(s + "��");
		
		
	}
}
