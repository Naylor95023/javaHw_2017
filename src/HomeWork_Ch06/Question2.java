package HomeWork_Ch06;

/*
 *�g�@�Ӥ�k�i�H��Xn���� 
 */
//�p���
class Calculate {
	//�^�ǿ�J�����`�M
	public long _factorial(int n){
		long total = 1;
		for(int i = n; i > 0; i--){
			//System.out.print(i == 1?i + "=":i + "x");
			total *= i;
		}
		return total;
	}
	
	public long _fatorialR(int n){
		if (n == 1) return 1;
		return n * _fatorialR(n - 1);
	}
}
//main
public class Question2 {
	public static void main(String[] args) {
		Calculate c = new Calculate();	
		System.out.println(c._factorial(10));
		System.out.println(c._fatorialR(10));
	}
}
