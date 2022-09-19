package ArrayListImportant;

import java.util.ArrayList;
import java.util.Collections;

public class SWap {
	public static void main(String[] args) {
	ArrayList al = new ArrayList<>();
	al.add("Zero");
	al.add("first");
	al.add("seconds");
	al.add("Third");
	al.add("fourth");
	System.out.println(al);
	Collections.swap(al, 0, 3);
	System.out.println(al);
	for (Object str : al) {
		System.out.println(str);
		
	}
}
}
