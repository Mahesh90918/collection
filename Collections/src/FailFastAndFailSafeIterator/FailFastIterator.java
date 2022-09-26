package FailFastAndFailSafeIterator;

import java.util.ArrayList;
import java.util.Iterator;

public class FailFastIterator {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		// fail fast iteartor
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);
		System.out.println(list);
		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			Integer i = itr.next();
			if (i==100) {
				list.remove(i);
			}
			System.out.println(itr.next());
		}

	}
}
