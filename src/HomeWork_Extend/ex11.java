package HomeWork_Extend;

public class ex11 {

	public static void main(String[] args) {
		int i = 0;
		while(i < 100){
			i++;
			if ((i % 5) == 0) continue;
			System.out.print(i + ":���� =" + Math.pow(i, 2));
			System.out.println("/�ߤ� =" + Math.pow(i, 3));
		}

	}

}
