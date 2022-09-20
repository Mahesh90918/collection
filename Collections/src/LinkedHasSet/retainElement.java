package LinkedHasSet;

import java.util.LinkedHashSet;

public class retainElement {

	// Program: How to compare two LinkedHashSet and retain elements
	// which are same on both LinkedHashSet?

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
		LinkedHashSet<String> link1 = new LinkedHashSet<>();
		link1.add("Zero");
		link1.add("Zero");
		link1.add("First");
		link1.add("mahesh");
		
		
		link1.retainAll(link);
		System.out.println(link1);
		
		link.retainAll(link1);
		System.out.println(link);
	}
}
