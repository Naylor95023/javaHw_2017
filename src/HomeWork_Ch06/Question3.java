package HomeWork_Ch06;

import java.util.Arrays;

/*
 * ���g�@�Ӥ�k�A�i�H�ƦC�}�C����
 */

//�Ƨ�
class Sorter{
	//�I�s�ƧǨ�ƫ�^��
	public int[] _mySort(int[] arrayInt){
		Arrays.sort(arrayInt);
		return arrayInt;
	}
	
	public void _printSort(int[] arrayInt){
		for(int i = 0; i < 10; i++)
			System.out.println(arrayInt[i]);
	}
}
//main
public class Question3 {
	public static void main(String[] args) {
		int[] arrayInt = {7, 5, 12, 521, 321, 1024, 2048, 1, 99, 86400};
		//sort
		Sorter s = new Sorter();
		s._mySort(arrayInt);
		s._printSort(arrayInt);
		//�L�X���G
	}
}
