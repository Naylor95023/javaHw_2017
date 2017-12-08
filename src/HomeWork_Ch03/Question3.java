package HomeWork_Ch03;

import java.util.Scanner;

/*
 *輸入兩個整數，求和差積商餘數 
 */

public class Question3 {
	// private static Scanner scanner;

	public static void main(String[] args) {
		// 輸入
		Scanner myScanner;
		myScanner = new Scanner(System.in);
		
		int intput1 = myScanner.nextInt();
		int intput2 = myScanner.nextInt();
		// 輸出
		System.out.println("和 : " + (intput1 + intput2));
		System.out.println("差 : " + (intput1 - intput2));
		System.out.println("積 : " + (intput1 * intput2));
		System.out.println("商 : " + (intput1 / intput2));
		System.out.println("餘 : " + (intput1 % intput2));
		
		//myScanner.close();
	}
}
