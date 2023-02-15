package list;

import java.util.LinkedList;

public class Likedlist {
	public static void main(String[] args) {
		LinkedList<String> l = new LinkedList<String>();
		l.add("pradeep");
		l.add("deep");
		l.add("nakul");
		l.add("mohanlal");
		l.add("mamuty");
		l.add("nakul");
		l.add("dquler");
		l.add("deep");
		String first = l.getFirst();
		System.out.println(first);
		String last = l.getLast();
		System.out.println(last);
	    l.offerFirst("1000");
		System.out.println("Afterfirstoffer:"+l);
		l.offerLast("1000");
		System.out.println("afterlastoffer:"+l);
		
		
		
//		System.out.println("print the linked list:"+ l);
//		l.removeFirstOccurrence("nakul");
//		System.out.println("after removeallfirst: "+ l);
//		l.removeLastOccurrence("dquler");
//		System.out.println("after removalllast :"+ l);
	}

}
