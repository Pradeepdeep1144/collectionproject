package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionMap {
	public static void main(String[] args) {
		Map<Integer,String> k = new HashMap<Integer,String>();
		k.put(1, "dhoni");
		k.put(2, "dhoni");
		k.put(3, "dhoni");
		k.put(4, "dhoni");
		k.put(5, "dhoni");
		System.out.println(k);
		
		System.out.println(k.size());
		System.out.println(k.containsKey(5));
		String a = k.get(5);
		System.out.println(a);
		
		System.out.println("hii");
		System.out.println(a);
		
		
		Set<Integer> keySet = k.keySet();
		System.out.println(keySet);
		
		Iterable<String> values = k.values();
		System.out.println( values );
		
		boolean containsValue = k.containsValue("dhoni");
		System.out.println(containsValue);
		
		Set<Entry<Integer, String>> entrySet = k.entrySet();
		System.out.println(entrySet);
	}

}
