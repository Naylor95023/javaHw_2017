package HomeWork_Ch03;

import java.util.Scanner;

/*
 *��J��Ӿ�ơA�D�M�t�n�Ӿl�� 
 */

public class Question3 {
	// private static Scanner scanner;

	public static void main(String[] args) {
		// ��J
		Scanner myScanner;
		myScanner = new Scanner(System.in);
		
		int intput1 = myScanner.nextInt();
		int intput2 = myScanner.nextInt();
		// ��X
		System.out.println("�M : " + (intput1 + intput2));
		System.out.println("�t : " + (intput1 - intput2));
		System.out.println("�n : " + (intput1 * intput2));
		System.out.println("�� : " + (intput1 / intput2));
		System.out.println("�l : " + (intput1 % intput2));
		
		//myScanner.close();
	}
}
