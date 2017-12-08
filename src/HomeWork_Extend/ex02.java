package HomeWork_Extend;

public class ex02 {

	public static void main(String[] args) {
		int a = 1, b = 2;
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		a = 1; b = 2;
		b=a+b-(a=b);
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		int m = 1, n = 2;
		m = m ^ n;
		n = m ^ n;
		m = m ^ n;
		System.out.println("m: " + m);
		System.out.println("n: " + n);
		
		m = 1; n = 2;
		m = (m = m ^ n) ^ (n = m ^ n);
		System.out.println("m: " + m);
		System.out.println("n: " + n);
	}

}
