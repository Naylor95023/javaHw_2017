package HomeWork_Ch05;

/*
 * �H�����ͤ���1~42���H���ơA������
 */

public class Question2 {
	public static void main(String[] args) {
		int[] array = new int[6];
		int r = 0;
		//�����Ʈɯ��ޤ����e�[
		for(int i = 0; i < array.length; i++){
			r = (int)(Math.random() * 42) + 1;
			array[i] = r;
			for(int j = i - 1; j >= 0; j--){
				if(array[j] == r) i--;
			}
		}	
		
		//print
		for(int i = 0; i < array.length; i++)
			System.out.println(array[i]);
	}
}
