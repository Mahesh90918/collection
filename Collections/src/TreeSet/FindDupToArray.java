package TreeSet;

import java.util.Arrays;
import java.util.TreeSet;

public class FindDupToArray {
	// Program: Write a program to find duplicate value from an array.
	public static void main(String[] args) {
		String s[] = { "Zero", "one", "Two", "Zero", "one", "Three", "four" };
		TreeSet<String> tree = new TreeSet<>(Arrays.asList(s));
		System.out.println(tree);
		for (String str : tree) {
			if (!tree.add(str)) {
				System.out.println("Duplicate Entry is: " + str);
			}

		}
		System.out.println("................");
		
	}
}
