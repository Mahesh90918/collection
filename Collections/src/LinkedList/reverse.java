package LinkedList;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class reverse {
	public static void main(String[] args) {
		LinkedList<String> l = new LinkedList<String>();
		l.add("Durga");
		l.add("Botsa");
		l.add("Car");
		l.add("Duppada");
		l.add("Apparao");
		l.add("mahesh");
		System.out.println(l);
		// 1.way
//	Collections.reverse(l);
//	System.out.println(l);
		// 2.way
		Iterator<String> i = l.descendingIterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

	}
}
