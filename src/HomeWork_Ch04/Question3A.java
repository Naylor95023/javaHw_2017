package HomeWork_Ch04;

/*
 *1~10�s�� �Hwhile���� 
 */

public class Question3A {
	public static void main(String[] args) {
		int ans = 1, i = 1;
		while(i <= 10){
			ans *= i;
			i++;
		}
		System.out.println(ans);
	}
}
