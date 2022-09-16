package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class sorting1 {
public static void main(String[] args) {
	ArrayList mobile=new ArrayList();
	mobile.add("mahesh");
	mobile.add("apparao");
	mobile.add("hymavathi");
	mobile.add("harinarayana");
	mobile.add("Harinarayana");
	mobile.add("10");
	// Ascii values sorting
	Collections.sort(mobile);
	System.out.println(mobile);
	
	ArrayList al= new ArrayList();
	al.add(4);
	al.add(3);
	al.add(2);
	al.add(5);
	al.add(7);
	Collections.sort(al);
	System.out.println(al);
}
}
