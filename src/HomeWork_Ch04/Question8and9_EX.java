package HomeWork_Ch04;

/*
 * �L�X�D��8+9���X��
 */

public class Question8and9_EX {
	public static void main(String[] args) {
		//�q7�����-7�����L0
		//8 - ��������� = �L�X����
		for(int i = 7; i > -15; i-- ){
			if(i == 0) continue;
			for(int j = 0; j < 8 - (Math.abs(i)); j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
