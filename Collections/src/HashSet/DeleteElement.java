package HashSet;

import java.util.HashSet;

public class DeleteElement {
//How to delete all elements from HashSet?
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("Zero");
		set.add("First");
		set.add("Second");
		set.add("Third");
		set.add("Fourth");
		set.add("Fifth");
		System.out.println(set);
		set.remove("Fifth");
		System.out.println(set);
		System.out.println(set.size());
		set.clear();
		System.out.println(set);
		System.out.println(set.size());

	}

}
