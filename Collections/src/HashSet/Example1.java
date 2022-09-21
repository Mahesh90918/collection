package HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class Example1 {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("Zero");
		list.add("First");
		list.add("Second");
		list.add("Third");
		System.out.println(list);
		HashSet<String> set = new HashSet<String>();
		set.add("siva");
		set.add("sriman");
		set.add("shan");
		set.add("mahesh");

		HashSet<String> s = new HashSet<String>();
		s.add("siva1");
		s.add("siva2");
		// how to copy another collection object to HashSet object
		s.addAll(set);
		s.addAll(list);
		System.out.println(s);
		set.addAll(s);
		set.addAll(list);
		System.out.println(set);
		
		System.out.println("........Iterator.......");
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("........ForLoop.........");
		for (String str : set) {
			System.out.println(str);
		}
	}
}
