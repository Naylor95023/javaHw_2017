package HomeWork_Ch03;

/*
 * 說明5+5、5+'5'、5+"5"的結果
 */

public class Question7 {
	public static void main(String[] args) {
		//整數
		System.out.println(5 + 5);
		//字元->整數
		System.out.println(5 + '5');
		//整數->字串
		System.out.println(5 + "5");
		//整數->浮點數
		System.out.println(5.0 + 5);
		System.out.println(5 + 5.0f);
	}
}


//5表示成字元又與整數5相加，所以以utf編碼十進制表示(53)
// 5 + 53 = 58