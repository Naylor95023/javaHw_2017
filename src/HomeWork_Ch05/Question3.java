package HomeWork_Ch05;

import java.util.GregorianCalendar;
import java.util.Scanner;

/*
 * ��J�Y�Ӧ~���
 * �p��O�Ӧ~�ĴX��
 */

public class Question3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		int month = scan.nextInt();
		int date = scan.nextInt();
		int[] days = { 0, 31, 28, 31, 30, 31, 30,
				31, 31, 30, 31, 30, 31 };
		//�P�_�|�~
		GregorianCalendar gc = new GregorianCalendar(); 
		if(gc.isLeapYear(year)) days[2] = 29;
		//�p��Ѽ�
		int total = 0;
		for(int i = 1; i < month; i++){
			total += days[i];
		}total += date;
		scan.close();
		System.out.println("����" + total + "��");
	}
}
