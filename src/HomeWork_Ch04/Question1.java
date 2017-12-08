package HomeWork_Ch04;

/*
 * 隨機產生1~100整數10個相加
 */

public class Question1 {
	public static void main(String[] args) {
		int sum = 0, r = 0;
		

		for(int i =0; i < 10; i++){
			r = (int)(Math.random() * 101);
			sum += r;
			sum = sum + r;
		}
		
		
		System.out.println("Sum : " + sum);
		
	}
}
