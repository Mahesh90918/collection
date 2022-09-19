package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class SubList {
	public static void main(String[] args) {
		LinkedList<String> l = new LinkedList<>();
		l.add("String0");
		l.add("String1");
		l.add("String2");
		l.add("String3");
		l.add("String4");
		System.out.println(l);
		List<String> l2 = l.subList(2, 4);
		System.out.println("SubList  :" + l2);
	}
}
