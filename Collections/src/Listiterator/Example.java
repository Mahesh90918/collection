package Listiterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Example {
	/*
	 * Using ListIterator, we can iterate all elements of a list in either
	 * direction. You can access next element by calling next() method, and also you
	 * can access previous element by calling previous() method on the list.
	 * 
	 */
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list);
		ListIterator<Integer> li = list.listIterator();
		System.out.println("Elements in forward directiton");
		while (li.hasNext()) {
			System.out.println(li.next());
		}
		System.out.println("Elements in backWord directiton");
		while (li.hasPrevious()) {// above forward direction is Must
			System.out.println(li.previous());
		}
	}
}
