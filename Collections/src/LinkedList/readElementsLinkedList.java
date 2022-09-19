package LinkedList;

import java.util.LinkedList;

public class readElementsLinkedList {
public static void main(String[] args) {
	LinkedList<String> s= new LinkedList<String>();
	s.add("zero");
	s.add("first");
	s.add("second");
	s.add("third");
	s.add("fourth");
	System.out.println(s);
	System.out.println(".....First position................");
	System.out.println(s.getFirst());// first position
	System.out.println(s.element());// first position
	System.out.println(s.peek());// first position
	System.out.println(s.peekFirst());// first position
	System.out.println(".....last position................");
	System.out.println(s.peekLast());// last position
	System.out.println(s.getLast());// last position

	System.out.println("...........our position option..................");
	System.out.println(s.get(2));
	System.out.println(s.get(4));
}
}
