package HomeWork_Ch07;
import HomeWork_Ch06.Question2;

//�������O�Q�sĶ�ɡA�������R�A�϶�
//�L�X"BlockA->B->C"�A�A����main��k�A
//Question1���O������Q�ŧi�A����غc�l�A�L�X"Constructor"
//�̫�L�X"Hahaha"
abstract class absTest{
	public abstract void method();
	public  void method2(){
		// do nothing
	}
	public abstract void method3();
}

class obj{
 int _n = 5;
}

public class Question1<T> {
	int Qn = 9;
	static {
		System.out.println("BlockA!!!");
	}
	
	Question1() {
		System.out.println("Constructor!!!");
	}
	
	static {
		System.out.println("BlockB!!!");
	}
	
	public static int method(int n){
		return n * 100;
	}
	public static int method2(obj o){
		return o._n * 100;
	}
	
	public static void main(String[] args) {
		System.out.println("Main!!!");
		Question1 test = new Question1();
		System.out.println("Hahaha!!!");
		
		int n = 1;
		System.out.println(Question1.method(n));
		obj o = new obj();
		System.out.println(Question1.method2(o));
	}
	
	static {
		System.out.println("BlockC!!!");
	}
}

