package LinkedList;

import java.util.LinkedList;

public class containsAll {
public static void main(String[] args) {
	LinkedList<String> lk= new LinkedList<String>();
	lk.add("Zero");
	lk.add("first");
	lk.add("second");
	lk.add("third");
	LinkedList<String> lk1=new LinkedList<String>();
	lk1.add("Zero");
	lk1.add("second");
	System.out.println(lk.containsAll(lk1));// true
	//System.out.println(lk1.containsAll(lk));// false
	lk1.add("mahesh");
	System.out.println(lk.containsAll(lk1));//false
}
}
