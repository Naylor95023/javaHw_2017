package HomeWork_Ch10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * Ū��simple.tet
 * �L�X�ɦW�A�j�p�A���
 */

public class Question2 {
	public static void main(String[] args) {
		
		File sample = new File("D:\\Sample.txt");
		int count=0;
		StringBuilder sb = new StringBuilder();
		
		try(FileReader fr = new FileReader(sample);
			BufferedReader br = new BufferedReader(fr);
		){
			//�ɦW�B�줸��
			System.out.print(sample.getName());
			System.out.println("�t��" + sample.length() + "�줸��");
			//�X�Ӧr���A�X�C���
			String stemp = null;
			while( (stemp = br.readLine())!= null) {
				sb.append(stemp);
				count++;
			}
			System.out.print(sb.length()+ "�Ӧr��");
			System.out.println(count + "�C���");	
		} 
		//�ҥ~
		catch (FileNotFoundException e) {
			System.out.println("FileNotFound");
		} catch (IOException e) {
			System.out.println("IOException");
		}
	}
}
