package HomeWork_Ch09;

import java.math.BigInteger;
import java.util.*;

public class Question1 {
	//印出
	public static void _print(Object[] o){
		for(int i = 0; i <o.length; i++){
			System.out.println(o[i]);
		}
	}
	//main
	public static void main(String[] args) {
		
		Collection<Object> v = new ArrayList<Object>();
	
 		v.add(new Integer(100));
		v.add(new Double(3.14));
		v.add(new Long(21L));
		v.add((short)100);
		v.add(new Double(5.1));
		v.add("Kitty");
		v.add(new Integer(200));
		v.add(new Object());
		v.add("sonppy");
		v.add(new BigInteger("1000"));
		
		//印出
		Object[] o = v.toArray();
		_print(o);
		
		//印iterator
		Iterator<Object> vI = v.iterator();
		while (vI.hasNext()) { 
			String s = vI.next().toString();
			System.out.println(s);
		}
		
		//移除非Number物件
		for(int i = 0; i <o.length; i++)
			if(!(o[i] instanceof Number))
				v.remove(o[i]);
		System.out.println("----移除非Number物件後-----");
		
		
		o = v.toArray();	
		_print(o);
		
		
		
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		Iterator<Integer> al_I = al.iterator();
		
		Queue<Integer> q = new LinkedList<Integer>(); 
		Iterator<Integer> qI = q.iterator();

		Stack<Integer> s = new Stack<Integer>();
		Iterator<Integer> s_I = s.iterator();
		
		TreeSet<Number> treeSet = new TreeSet<Number>((a, b)->(int)(a.doubleValue() - b.doubleValue()));
		/*
		TreeSet<Number> treeSet2 = new TreeSet<Number>(new MyComparator());
		TreeSet<Number> treeSet2 = new TreeSet<Number>(new Comparator<Number>() {
			@Override
			public int compare(Number a, Number b) {
				return (int)(a.doubleValue() - b.doubleValue());
			}
		});
		*/
		treeSet.add(18.5);
		treeSet.add(52);
		treeSet.add(100.25);
		treeSet.add(5);
		Iterator<Number> tree_I = treeSet.iterator();
		double total = 0.0;
		while(tree_I.hasNext()){
			double d = (double) tree_I.next().doubleValue();
			System.out.println("d" + d);
			total += d;
		}
		System.out.println("Total");
		System.out.println(total);

		
	
			
	}
}
/*	
 		ArrayList<String> numbers = new ArrayList<String>();
		Iterator<String> numbersI = numbers.iterator();

		Queue q = new LinkedList(); 
		Iterator iq = q.iterator();

		Stack s = new Stack();
		Iterator is = s.iterator();
		for (Object obj:v)
			System.out.println("for : " + obj);
		
		
		
		
		
		Iterator<Object> vI = v.iterator();
		while (vI.hasNext()) { 
			String s = vI.next().toString();
			System.out.println(s);
		}
		
		
		//移除非Number物件
		for(int i = 0; i <o.length; i++)
			if(!(o[i] instanceof Number))
				v.remove(o[i]);
		System.out.println("----移除非Number物件後-----");
		o = v.toArray();	
		_print(o);
	*/





/*印出
		
/*

*/

