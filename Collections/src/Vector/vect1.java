package Vector;

import java.util.Vector;

public class vect1 {
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.add("Zero");
		v.add("first");
		v.add("second");
		v.add("Third");
		v.add("fourth");
		v.add("fifth");
		System.out.println(v);
		 //adding element at specified index
		v.add(2, "siva");
		System.out.println(v);
		//getting elements by index
		System.out.println(v.get(3));
		 //adding element at specified index
		v.set(4, "set");
		System.out.println(v);
		v.addElement("mahi");
		System.out.println(v);
		System.out.println("first element :"+v.firstElement());
		System.out.println("last element :"+v.lastElement());
		System.out.println(v.isEmpty());
		v.clear();
		System.out.println(v);
		System.out.println(v.isEmpty());
	}
}
