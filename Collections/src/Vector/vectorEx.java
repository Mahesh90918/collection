package Vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class vectorEx {
	public static void main(String[] args) {
		Vector v = new Vector<>();
		v.add("Zero");
		v.add("first");
		v.add("second");
		v.add("Third");
		v.add("fourth");
		v.add("fifth");

		System.out.println(v);
		System.out.println("....Enumeration.....");
		Enumeration e= v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		System.out.println(".....Iterator......");
		Iterator i = v.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

	}
}
