package ArrayList;

import java.util.ArrayList;

public class ContainsExample {
	public static void main(String[] args) {
		ArrayList fruit = new ArrayList<>();
		fruit.add("1.apple");
		fruit.add("2.anner");
		fruit.add("3.bananna");
		fruit.add("4.papayya");
		fruit.add("5.WaterMilen");
		fruit.add("6.mango");
		fruit.add("6.mango");

		fruit.set(4, "hhhhhhh");

		if (fruit.contains("6.mango")) {
			// Set is used to change the element
			fruit.set(5, "......");
			fruit.set(6, "......");
		}

		System.out.println(fruit);
	}
}
