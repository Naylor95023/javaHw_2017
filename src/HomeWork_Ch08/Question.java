package HomeWork_Ch08;



public class Question {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(
				new Runnable() {
					public void run() { 
						System.out.print("Thread!"); 
					}}
				);
		
		
		javaClass jc = new javaClass(){
			@Override
			public void JPrint() {
				System.out.print("JAVA Print!");		
			}			
		};
		
		jc.doJPrint();

	}

}
