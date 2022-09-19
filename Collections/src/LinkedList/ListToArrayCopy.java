package LinkedList;

import java.util.LinkedList;

public class ListToArrayCopy {
//How to copy LinkedList to array?
	public static void main(String[] args) {
		LinkedList<String> s= new LinkedList<>();
		s.add("one");
		s.add("first");
		s.add("third");
		s.add("fourth");
		System.out.println(s);
		String [] str= new String[s.size()];
		s.toArray(str);// must toArray
		 System.out.println("Created Array content:");
		 for (String st1 : str) {
			 System.out.println(st1);
			
		}
	}
}
