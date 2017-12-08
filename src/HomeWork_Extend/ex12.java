package HomeWork_Extend;

public class ex12 {

	public static void main(String[] args) {
		int count = 0;
		for(int i = 2001; i < 2401; i++){
			if(i % 4 == 0)count++;
			if(i % 100 ==0)count--;
			if(i % 400 ==0)count++;
		}
		System.out.println(count);

	}

}
