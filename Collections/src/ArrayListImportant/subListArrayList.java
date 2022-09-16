package ArrayListImportant;

import java.util.ArrayList;

public class subListArrayList {
public static void main(String[] args) {
	ArrayList al = new ArrayList<>();
	al.add("Zero");
	al.add("first");
	al.add("second");
	al.add("third");
	al.add("fourth");
	System.out.println(al);
	al.subList(2, 4);
}
}
