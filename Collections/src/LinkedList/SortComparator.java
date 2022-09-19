package LinkedList;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

//How to sort LinkedList using Comparator?
public class SortComparator {
	public static void main(String[] args) {
		LinkedList<String> l = new LinkedList<String>();
		l.add("D");
		l.add("B");
		l.add("C");
		l.add("D");
		l.add("A");
		System.out.println(l);
		Collections.sort(l);
		System.out.println(l);
//		Collections.sort(l, new Comparator<String>() {
//			@Override
//			public int compare(String o1, String o2) {
//				// TODO Auto-generated method stub
//				return o1.compareTo(o2);
//			}
//		});
//		System.out.println(l);
		LinkedList l1 = new LinkedList();
		l1.add(10);
		l1.add(7);
		l1.add(5);
		l1.add(4);
		l1.add(9);
		System.out.println(l1);
		Collections.sort(l1);
		System.out.println(l1);
		
	}

}
