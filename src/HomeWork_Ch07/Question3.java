package HomeWork_Ch07;

//宣告smile為抽象方法

abstract class Human {
	int _weight = 50;
	abstract void _smile();
}

class OrdinaryPeople extends Human {
	@Override
	void _smile() {
		System.out.println("HA");
	}	
}

class HappyMary extends OrdinaryPeople {
	void _smile() {
		System.out.println("HA Happy Mary");
	}	
}

public class Question3 {
	public static void main(String[] args) {
		HappyMary hm = new HappyMary();	
		OrdinaryPeople op = new OrdinaryPeople ();
		hm._smile();	
		op._smile();
		
		HappyMary HM = new HappyMary(){
			@Override
			public void _smile() { 
				System.out.print("HA INSTANCE"); 
			}
		};
	}
}

/*
 * 
 */


/*

*/
