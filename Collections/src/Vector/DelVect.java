package Vector;

import java.util.Vector;

public class DelVect {
	// How to delete all elements from my vector?
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(11);
		v.add(12);
		v.add(14);
		v.add(15);
		v.add(16);
		System.out.println(v);
		System.out.println(v.contains(11));
		v.clear();
		System.out.println(v);
		System.out.println(v.contains(11));
	}
}
