package HomeWork_Ch06;

/*
 * �g�@�Ӥ�k�A�^�Ǥ���1~42��ƪ��}�C
 */

//���Ͷü����O
class Number {
	//����1~42�üƤ�k
	public int[] _luckyNumbers(){
		int[] arrayInt = new int[6];
		for(int i = 0; i < 6; i++){
			arrayInt[i] = (int)(Math.random() * 42) + 1;
		}
		return arrayInt;
	}
}
//main
public class Question4 {
	public static void main(String[] args) {
		Number n = new Number();
		int[] array = n._luckyNumbers();
		
		for(int i = 0; i < 6; i++){
			System.out.println(array[i]);
		}
	}
}
