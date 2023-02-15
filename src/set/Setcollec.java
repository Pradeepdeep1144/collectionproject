package set;

import java.util.HashSet;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Setcollec {
	public static void main(String[] args) {
		Set<Object> s = new TreeSet <Object>() ;
		s.add("d");
		s.add("a");
		s.add("b");
		s.add("c");
		int size = s.size();
		System.out.println(size );
		
		boolean contains = s.contains("d");
		System.out.println(contains );
		
		System.out.println(s);
	}

}
