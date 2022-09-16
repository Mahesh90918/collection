package ArrayListImportant;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {
	public static void main(String[] args) {
		ArrayList al = new ArrayList<>();
		al.add("Zero");
		al.add("first");
		al.add("second");
		al.add("third");
		al.add("fourth");
		System.out.println(al);
		Collections.reverse(al);// using Reverse Method
		System.out.println("Reverse Array  :" + al);
		
	}
}
