package FailFastAndFailSafeIterator;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class mapConCurrentMod {
	public static void main(String[] args) {
		ConcurrentMap<Integer, String> map = new ConcurrentHashMap<>();
		map.put(01, "one");
		map.put(02, "two");
		map.put(03, "three");
		map.put(04, "four");
		map.put(05, "five");
		Iterator<Integer> itr = map.keySet().iterator();
		while (itr.hasNext()) {
			// System.out.println(itr.next());
			Integer itr1 = itr.next();
			map.put(06, "Six");
			if (itr1 == 01) {
				map.remove(itr1);
			}
		}
		System.out.println(map);
		map.replace(06, "Six", "mahesh");
		System.out.println(map);
	}
}
