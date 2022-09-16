package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class sorting {
public static void main(String[] args) {
	ArrayList fruit = new ArrayList<>();
	fruit.add("1.apple");
	fruit.add("2.anner");
	fruit.add("3.bananna");
	fruit.add("4.papayya");
	fruit.add("5.WaterMilen");
	fruit.add("6.mango");

	ArrayList grocerious = new ArrayList<>();
	grocerious.add("1.table");
	grocerious.add("2.chair");
	grocerious.add("3.bench");
	grocerious.add("4.window");
	grocerious.add("5.door");

	ArrayList vegitable = new ArrayList<>();
	vegitable.add("1.potato");
	vegitable.add("2.brijal");
	vegitable.add("3.tomoto");
	vegitable.add("4.cabage");
	vegitable.add("5.laide finger");

	ArrayList supermarket = new ArrayList<>();
	// add means print Array Type
	supermarket.add(vegitable);
	supermarket.add(grocerious);
	supermarket.add(fruit);
	Collections.sort(fruit);
	System.out.println(fruit);
	// size of the array length
	System.out.println(fruit.size());
}
}
