package FailFastAndFailSafeIterator;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class conCurrentModifuication {
	public static void main(String[] args) {
		// fail safe iteartor
		CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);
		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			Integer i = itr.next();
			if (i == 100) {
				list.remove(i);

			}
		}
		System.out.println(list);
	}
}
