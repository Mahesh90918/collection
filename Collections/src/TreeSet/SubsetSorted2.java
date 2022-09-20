package TreeSet;

import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SubsetSorted2 {
	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
		});
		set.add("F");
		set.add("G");
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("E");
		System.out.println(set);
		Set<String> subset = set.subSet("B", "E");
		System.out.println("subset :" + subset);
		subset = set.subSet("B", true, "E", true);
		System.out.println("subset :" + subset);
		subset = set.subSet("B", false, "E", true);
		System.out.println("subset :" + subset);
		subset = set.subSet("B", true, "E", false);
		System.out.println("subset :" + subset);

	}
}
