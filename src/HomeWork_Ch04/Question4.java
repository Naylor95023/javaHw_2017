package HomeWork_Ch04;

/*
 * for�L�X�D�ذT��
 * 1 4 9 16 25 36 49 64 81 100
 */

public class Question4 {
	public static void main(String[] args) {
		int now = 1;
		//���W�j�p��3 6 5 7 9 11...��19
		//�t��2�B�_�l�O3
		for(int i = 3; i < 22; i+=2){
			System.out.print(now + " ");
			now += i;
		}	
	}
}
