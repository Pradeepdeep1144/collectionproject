package list;

import java.util.ArrayList;

public class Colle {
	public static void main(String[] args) {
		ArrayList<Integer> s = new ArrayList<Integer>();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);
		System.out.println(s.add(60));
		System.out.println(s.contains(40));
		System.out.println("Index"+s.indexOf(60));
		System.out.println(s.get(3));
		System.out.println(s.set(0, 200));
		System.out.println(s.size());
		s.sort(null); //it is used to print ascending order
		//System.out.println(s.remove(0));
	    boolean empty = s.isEmpty();
	    System.out.println("empty"+empty); // it is used to check the collection is empty or not 
		
		//s.clear();
		System.out.println(s);
		ArrayList s1 = new  ArrayList();
		//s1.retainAll(s);
		//System.out.println("retainall"+s);
		//s1.clear();// it is used to clear collection
		
		
		
	}

}
