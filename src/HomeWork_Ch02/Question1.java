package HomeWork_Ch02;
/*
 *第二章 1.
 *長方形邊長與面積
*/
//sysout alt+/
//ctrl shift o
public class Question1 {
	public static void main(String[] args) {
		//數值
		int x = 15, y = 6;
		
		//周長面積
		int total_Length = (x + y) * 2;
		int area = x * y;
		
		//
		System.out.println("周長 : " + total_Length);
		System.out.println("面積 : " + area);
	}
}
	
	
	
	/*
	int a = 1;
	int b = 2;
	int c = a & b;
	int d = a|b;
	int e = a ^b;
	System.out.println(c);
	System.out.println(d);
	System.out.println(e);
	
}
static int factr(int n)
{
    return n<=0 ? 1 : n*factr(n-1);
}
*/
