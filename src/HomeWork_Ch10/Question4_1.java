package HomeWork_Ch10;

/*
 * �H���[�Ҧ��g�J1~1000�üƤQ��
 * �AŪ�X��
 */

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Question4_1 {
	public static void main(String[] args) {
		//���ɮ׼g�J
		try(FileOutputStream fos = new FileOutputStream("D:\\DataR.txt",true);
			DataOutputStream bos = new DataOutputStream(fos);
			){
				for(int i = 0; i < 10; i++){
					int r = (int) (Math.random() * 1001);
					System.out.println(r);
					bos.writeInt(r);
				}
				//bos.write(-1);
				bos.close();
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFound");
		} catch (IOException e) {
			System.out.println("IOException");
		} 		
		
		
		//Ū��
		
			try(FileInputStream fis = new FileInputStream("D:\\DataR.txt");
				DataInputStream	dis = new DataInputStream(fis);
			){
				int i;
				while(true){
					i = dis.readInt();
		           System.out.println("number : " + i);
				}
			}
			//�ҥ~���}
			catch (EOFException e) {
				System.out.println("EOF");
				//break;
			} catch (FileNotFoundException e) {
				System.out.println("FileNotFound");
			} catch (IOException e) {
				System.out.println("IOException");
			} 	

	}

}
