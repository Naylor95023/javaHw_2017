package HomeWork_Ch10;

/*
 * Ū�Xcat�Pdog����
 * �ð���smile��k
 * (�����@�P�~��mammal�A��mammal�o�O�o��@�ǦC�ܤ���)
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Question6 {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		Mammal[] animal = new Mammal[4]; 
		//Ū��
		File ObjF = new File("D:\\data", "Object.dat");
		try(FileInputStream fis = new FileInputStream(ObjF);
			ObjectInputStream ois = new ObjectInputStream(fis)
		){
			for(int i = 0; i < 4; i++){
				animal[i] = (Mammal)ois.readObject();
				animal[i]._smile();
			}
		}
	}
}
