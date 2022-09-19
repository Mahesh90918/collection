package LinkedList;

import java.util.LinkedList;

public class PushPopOperations {
	public static void main(String[] args) {
		LinkedList<String> lk = new LinkedList<String>();
		lk.add("zero");
		lk.add("first");
		lk.add("Second");
		lk.add("Third");
		System.out.println(lk);
		System.out.println("After push operation:");
		lk.push("push element");
		System.out.println(lk);
		System.out.println("After pop operation:");
		lk.pop();
		System.out.println(lk);
// Fifo=First In First Out
	}
}
