package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class listtoLinkedList {
	//How to add all elements of a list to LinkedList?
	public static void main(String[] args) {
		LinkedList<String> lk = new LinkedList<String>();
		lk.add("first");
		lk.add("second");
		lk.add("third");
		List l= new LinkedList();
		l.add(100);
		lk.addAll(l);
		System.out.println(lk);
		List<String> l1= new ArrayList<String>();
		l1.add("fourth");
		lk.addAll(l1);
		System.out.println(lk);
		
	}

}
