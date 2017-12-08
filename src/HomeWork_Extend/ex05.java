package HomeWork_Extend;

import java.awt.List;
import java.util.ArrayList;

public class ex05 {

	public static void main(String[] args) {
		int n = 0,sum = 0;
		ArrayList<Integer> ln = new ArrayList<Integer>();
		while(n != -1){
			ln.add(n);
			n = (int)(Math.random() * 11) - 1;
		}
		for(int i: ln){
			sum += i;
		}
		System.out.println(sum+1);

	}

}
