package HomeWork_Ch03;

/*
 *�H������1~42�üƤ��� 
 */

public class Question5 {
	public static void main(String[] args) {
		int x = 0;
		// �P�_�d��A�L����
		for (int i = 0; i < 6;) {
			x = (int) (Math.random() * 101);
			if (x > 0 && x < 43) {
				System.out.println(x);
				i++;
			}
		}
	}
}
