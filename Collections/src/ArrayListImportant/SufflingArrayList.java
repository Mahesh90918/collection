package ArrayListImportant;

import java.util.ArrayList;
import java.util.Collections;

public class SufflingArrayList {
	public static void main(String[] args) {
		ArrayList al = new ArrayList<>();
		al.add("Zero");
		al.add("first");
		al.add("seconds");
		al.add("Third");
		al.add("fourth");
		System.out.println(al);
		Collections.shuffle(al);
		// Random Acess values like that
		System.out.println(al);
		// changes every time
		Collections.shuffle(al);
		System.out.println(al);
	}
}
