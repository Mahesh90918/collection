package TreeSet;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class DuplicateArray {
	//Program: Write a program to remove duplicate entries from an array.
	public static void main(String[] args) {
		String[] s = { "Zero", "one", "Zero", "one", "Two", "Three", "Four" };
		// convert string array to list
		//1. way
		System.out.println("....List.....");
		List<String> list = Arrays.asList(s);
		System.out.println(list);
		LinkedHashSet<String> hash = new LinkedHashSet<>(list);
		// inseration is preserved
		System.out.println(hash);
		System.out.println(".... TreeSet.....");
		TreeSet<String> tree = new TreeSet<>(list);
		// Sorting order is Availble (compare to Strings unique code representation)
		// create a treeset with the list, which eliminates duplicates
		// inseration is not preserved
		System.out.println(tree);
		System.out.println(".... TreeSet.....");
		// 2.way
		TreeSet<String> tree1 = new TreeSet<>(Arrays.asList(s));
		System.out.println(tree1);
		
	}
}
