package HomeWork_Ch04;

/*
 * �L�X
 * A
 * BB
 * CCC
 * DDDD
 * EEEEE
 * FFFFFF
 */

public class Question10 {
	public static void main(String[] args) {
		int c = 'A';
		//ABCDEF�ର��ƥ�s��
		//���W�ۥ[���ର�r���L�X
		for(int i = 0; i < 6; i++){
			for(int j = 0; j < (i + 1); j++){
				System.out.print((char)(c + i));
			}
			System.out.println(" ");
		}
	}
}
