package HomeWork_Ch03;

import java.util.Scanner;

/*
 *��J�T�Ӧr��A�L�X���� 
 */

public class Question4 {
	private static Scanner scanner;

	public static void main(String[] args) {
		//��J
		scanner = new Scanner(System.in);
		String intputS1;
		String intputS2;
		String intputS3;		
		intputS1 = scanner.next();
		intputS2 = scanner.next();
		intputS3 = scanner.next();
		
		//Print
		System.out.println("Next()>>>>>");
		System.out.println("S1 : " + intputS1 +" : "+ (intputS1.length()));
		System.out.println("S2 : " + intputS2 +" : "+ (intputS2.length()));
		System.out.println("S3 : " + intputS3 +" : "+ (intputS3.length()));
		scanner.close();
	}
}


/*
//��X
intputS1 = scanner.nextLine();
intputS2 = scanner.nextLine();
intputS3 = scanner.nextLine();
System.out.println("NextLine()>>>>>");
System.out.println("S1 : " + intputS1 +" : "+ (intputS1.length()));
System.out.println("S2 : " + intputS2 +" : "+ (intputS2.length()));
System.out.println("S3 : " + intputS3 +" : "+ (intputS3.length()));
System.out.println("\n");
*/