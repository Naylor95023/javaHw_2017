package HomeWork_Ch10;

/*
 * Ū�J�ɮר���ܦ줸�դj�p
 */

import java.io.File;

public class Question1 {

	public static void main(String[] args) {
		File f1 = new File("D:\\hello.txt");
		try{
			System.out.println("�ɮפj�p" + f1.length() + "�줸��");
		}finally{
			System.out.println("End");
		}
		
	}

}
