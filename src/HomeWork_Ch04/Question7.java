package HomeWork_Ch04;

/*
 * �N"Hello,World,�j�a�n"
 * �v�r�L�X�è���ƭ�
 */

public class Question7 {
	public static void main(String[] args) {
		String s = "Hello, World, �j�a�n";
		//char c_Index_s;
		for(int i = 0; i < s.length(); i++){
			//c_Index_s = s.charAt(i);
			//System.out.println(c_Index_s + " " + ((int)c_Index_s));
			System.out.println(s.charAt(i) + " " + ((int)s.charAt(i)));
		}
	}
}
