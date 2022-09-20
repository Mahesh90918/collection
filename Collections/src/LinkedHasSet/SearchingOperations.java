package LinkedHasSet;

import java.util.LinkedHashSet;

public class SearchingOperations {
	public static void main(String[] args) {

//Program: How to search an object from LinkedHashSet?
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
		System.out.println("Serching operation  : ");
		System.out.println(link.contains("Zero"));
	}
}
