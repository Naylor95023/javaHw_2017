package HomeWork_Ch09;

/*
 * �w�q�@��ArrayList<Double> ad
 * �ð��Ƨǫ�L�X
 */

import java.util.ArrayList;

public class Question3 {
	public static void main(String[] args) {
		//�ŧi��add
		ArrayList<Double> ad = new ArrayList<>();
		ad.add((double) 98);
		ad.add(12.345);
		ad.add(97.85);
		ad.add((double)12);
		//�Ƨǫ�L�X
		ad.sort(null);
		for(int i = 0; i < ad.size(); i++)
			System.out.println(ad.get(i));
	}
}
