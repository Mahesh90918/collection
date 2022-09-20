package TreeSet;

import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class TreeWithList {
// How to create a TreeSet with a List?
	public static void main(String[] args) {
		List<String> list=new LinkedList<String>();
		list.add("Zero");
		list.add("First");
		list.add("Second");
		list.add("Third");
		list.add("Fourth");
		System.out.println("List"+list);
		// Sorting order is Availble (compare to Strings unique code representation)
		TreeSet<String> tree = new TreeSet<>(list);
		System.out.println("Tree" + tree);
	}
}
