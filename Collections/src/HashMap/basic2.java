package HashMap;

import java.util.HashMap;
import java.util.Iterator;

public class basic2 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("mahesh", 3);
		map.put("ganesh", 2);
		map.put("ramesh", null);
		map.put("subbu", null);// value allowed so many times
		map.put(null, 5);
		map.put(null, 6);// one timr allow key
		System.out.println(map);
		System.out.println(".........Iterator........");
		Iterator itr = map.entrySet().iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
