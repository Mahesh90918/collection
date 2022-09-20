package LinkedHasSet;

import java.util.LinkedHashSet;

public class Basicprogram {
	// insertion order is preserved
	// duplicates not allowed
	// null one time allowed
	public static void main(String[] args) {
		LinkedHashSet<String> link = new LinkedHashSet<>();
		link.add("Zero");
		link.add("Zero");
		link.add("First");
		link.add("Second");
		link.add("Third");
		link.add("Fourth");
		link.add(null);
		link.add(null);
		System.out.println(link);
		System.out.println(link.size());
		System.out.println(link.isEmpty());// false
		link.remove("Zero");
		System.out.println("Remove Specific Object :"+link);
		link.clear();
		System.out.println(link);
		System.out.println(link.isEmpty());
	}

}
