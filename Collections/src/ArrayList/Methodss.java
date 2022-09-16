package ArrayList;

import java.util.ArrayList;

public class Methodss {
	public static void main(String[] args) {
		ArrayList al = new ArrayList<>();
		al.add('a');
		al.add("A");
		al.add(10);
		// al.remove(10);IndexOutOfBoundException by default is takes Index
		al.add(0, "Index 0");
		al.add(1, "Index 1");
		al.add(2, "Index 2");
		System.out.println(al);
		System.out.println("SIZE :" + al.size());
		al.remove(0);// index based
		System.out.println(al);
		System.out.println("SIZE :" + al.size());
		al.remove("A");// object based
		System.out.println(al);
		System.out.println("SIZE :" + al.size());
		al.remove("Index 1");// object based
		System.out.println(al);
		System.out.println("IsEmpty  :" + al.isEmpty());// false
		System.out.println("SIZE :" + al.size());
		al.clear();
		System.out.println("IsEmpty  :" + al.isEmpty());// true
		System.out.println("SIZE :" + al.size());
	}
}
