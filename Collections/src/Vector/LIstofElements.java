package Vector;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class LIstofElements {
	// How to find does vector contains all list elements or not?
	public static void main(String[] args) {
		Vector v = new Vector<>();
		v.add("first");
		v.add("second");
		v.add("thirs");
		v.add("fourth");
		v.add("fifth");
		List list = new ArrayList<>();
		list.add("first");
		list.add("fifth");
		System.out.println(list.containsAll(v));// false
		System.out.println(v.containsAll(list));// true
		list.add("six");// Adding Extra Element
		System.out.println(v.contains(list));// false

	}
}
