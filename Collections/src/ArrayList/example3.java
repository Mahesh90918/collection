package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class example3 {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(100);
		a.add(200);
		a.add(300);
		a.add(50);
		a.add(150);

		ArrayList a1 = new ArrayList<>(a);
		// a1.addAll(a);
		for (Object object : a1) {
			System.out.println(a1);
		}

		Iterator i = a1.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println(".....ListIterator.....");
		ListIterator l = a.listIterator();
		while (l.hasNext()) {
			System.out.println(l.next());
		}System.out.println(".....Pervious.....");
		while (l.hasPrevious()) {
			System.out.println(l.previous());
		}
		// java 8 sorting
		Collections.sort(a, (num1, num2) -> num1 - num2);
		System.out.println("Sorting :" + a);
	}
}
