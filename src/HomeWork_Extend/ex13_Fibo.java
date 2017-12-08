package HomeWork_Extend;

public class ex13_Fibo {

	public static int fibo(int n){
		if(n == 0) return 0;
		if(n == 1) return 1;
		else return fibo(n - 1) + fibo(n - 2);
	}
	
	public static void main(String[] args) {
		for(int i = 0;i < 31; i++){
			System.out.println(fibo(i));
		}
	}

}
