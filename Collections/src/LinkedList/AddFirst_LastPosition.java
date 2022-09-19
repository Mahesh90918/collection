package LinkedList;

import java.util.LinkedList;

public class AddFirst_LastPosition {
	public static void main(String[] args) {
		LinkedList<String> arrl = new LinkedList<String>();
		arrl.add("First");
		arrl.add("Second");
		arrl.add("Third");
		arrl.add("four");
		System.out.println(arrl);
		System.out.println("Adding element at first position...");
		arrl.addFirst("mahesh First");
		System.out.println(arrl);
		System.out.println("adding element at first position...");
		arrl.offerFirst("unukuru first");
		System.out.println(arrl);
		System.out.println("Adding element at Last position...");
		arrl.addLast("mahesh Last");
		System.out.println(arrl);
		System.out.println("Adding element at Last position...");
		arrl.offerLast("unukuru last");
		System.out.println(arrl);
		System.out.println(arrl.indexOf("unukuru last"));
		System.out.println(arrl.size());
		System.out.println("Adding element at last position...");
        arrl.offer("I am last - 2");
        System.out.println(arrl);
		
	}
}
