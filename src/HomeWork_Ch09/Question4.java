package HomeWork_Ch09;

/*
 * �ϥ�Array����k��r��}�C���Ƨ�
 */

import java.util.Arrays;

public class Question4 {
	public static void main(String[] args) {
		//�ŧi��Ƨ�
		String[] names = {"�i�g��", "�����", "�B����", "���l�l", "�����",
				"������", "�B���R", "���l�l", "�����", "�����"};
		Arrays.sort(names);
		//�L�X
		for(int i = 0; i < names.length; i++)
			System.out.println(names[i]);
	}

}
