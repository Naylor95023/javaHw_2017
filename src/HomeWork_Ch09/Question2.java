package HomeWork_Ch09;

import java.util.Collection;
import java.util.HashSet;

/*
 *�Q��SET�S�ʡA�קK�[�J���Ʃm�W 
 */

public class Question2 {
	
	public static void main(String[] args) {
		
		Collection<String> cs = new HashSet<>();
		String[] names = {"�i�g��", "�����", "�B����", "���l�l", "�����",
				"������", "�B���R", "���l�l", "�����", "�����"};
		//�[�J��L�X
		for(String s : names) cs.add(s);
		for(String s : cs)System.out.println(s);
		
	}

}
