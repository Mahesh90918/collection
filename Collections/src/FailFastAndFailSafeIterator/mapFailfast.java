package FailFastAndFailSafeIterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class mapFailfast {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(01, "one");
		map.put(02, "two");
		map.put(03, "three");
		map.put(04, "four");
		map.put(05, "five");
		Iterator<Integer> itr = map.keySet().iterator();
		while (itr.hasNext()) {
			// System.out.println(itr.next());
			Integer itr1 = itr.next();
			if (itr1 == 01) {
				map.remove(itr1);
			}
		}
		System.out.println(map);

	}
}
