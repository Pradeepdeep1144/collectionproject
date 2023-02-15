package list;

import java.util.ArrayList;
import java.util.List;

public class Collection_list {                   //list is a index based 
	public static void main(String[] args) {
		ArrayList s= new ArrayList();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add("hari");
		s.add('f');
		s.add(true);
		s.add(5, "danny"); // idayil add pana idha panuvom (index , object element)
		s.add("hari");
		System.out.println(s.add(100)); //this is add agiruchu na true illana false because it is boolean
		System.out.println(s.size()); // it is used to find size of the arraylist 
		System.out.println(s.contains("hari")); // contains is used to check the object is have or not (boolean)
		System.out.println(s.get(0));
		System.out.println(s.get(2));// get is used to get object by using index value
		System.out.println(s.set(4,"pradeep"));//it is using set to add object in betw using idex in set
		//System.out.println(s.remove(5)); // remove will remove the object by using index value
		System.out.println("index"+s.indexOf("pradeep")); //it is used to find the index value 
		System.out.println("index"+s.lastIndexOf("hari"));// it is used to know the lastindex value
		s.sort(null);//
		
		
		ArrayList s1 = new ArrayList();
		System.out.println(s1.addAll(s)); // it is used to copy the one arraylist to another arraylist
		System.out.println("s1 list is:"+s1);
		
		s1.retainAll(s);
		System.out.println("retainall"+s1);
		
		ArrayList s2 = new ArrayList();
		s2.add("dindigul");
		s2.add("karur");
		s2.add("hosur");
		s2.add("chennai");
		System.out.println("s2 list is :"+s2);
		s2.addAll(4, s1);
		System.out.println("s2 after addall:"+s2);// it is s2 vandhu s1 oda iruka indha method use panuvanga
		s2.retainAll(s1);
		System.out.println("retainall"+s2);// idhu vandhu inoru collection la irukuradha vanguradhuku
		
		s2.removeAll(s1);
	    System.out.println("s2 after removeall"+s2);
		
		//System.out.println(s2.subList(0, 5)); // it is used to get idhula irundhu idhu varaikum iruka values yeduthu tha 
	    
		//List subList = s2.subList(0, 5);
	   // System.out.println(subList);
		
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public static void main(String[] args) {
//		int i [] = {10,20,30};
//		System.out.println(i[0]);
//		System.out.println(i[1]);     //This all is array and it is length and it stores simalar data types 
//		System.out.println(i[2]);
//	

	
