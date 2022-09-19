package LinkedList;

import java.util.LinkedList;

public class removeMethod {
	public static void main(String[] args) {
		LinkedList<String> lk = new LinkedList<String>();
		lk.add("Zero");
		lk.add("first");
		lk.add("second");
		lk.add("third");
		lk.add("Zero");
		lk.add("third");
		lk.add("second");
		lk.add("first");
		lk.add("Zero");
		System.out.println(lk);
		lk.removeFirstOccurrence("Zero");
		System.out.println(lk);
		lk.removeLastOccurrence("first");
		System.out.println(lk);
		System.out.println(".......................");
		LinkedList<String> lk1 = new LinkedList<String>();
		lk1.add("Zero");
		lk1.add("first");
		lk1.add("second");
		lk1.add("third");
		lk1.add("fourth");
		lk1.add("fifth");
		lk1.add("six");
		lk1.add("seven");
		lk1.add("eight");
		System.out.println(lk1);
		lk1.remove();// first element remove
		System.out.println(lk1);
		lk1.removeFirst();// first element remove
		System.out.println(lk1);
		lk1.remove(1);// index based
		System.out.println(lk1);
		lk1.remove("seven");
		System.out.println(lk1);
		lk1.removeLast();// last element remove
		System.out.println(lk1);
	}
}
