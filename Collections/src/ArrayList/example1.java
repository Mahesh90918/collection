package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class example1 {
	// we are able to retrive the object from collection classes in 3 ways
	// 1. By using for each Loop
	// 2.By using get method
	// 3. by using cursors
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		// Duplicate objects are allowed.
		al.add(null);
		al.add("mahesh");
		al.add("mahesh");
		al.add("100");
		al.add(100);
		al.add(9.98);
		al.add('M');
		al.add(true);
		System.out.println(al);
		al.remove(3);
		System.out.println("remove index 3 :" + al);
		al.remove("mahesh");

		System.out.println("remove object mahesh:" + al);
		// 1 .Way itterate(by using for_each loop)
//		for (Object object : al) {
//			System.out.println(object);
//		}
		// 2.way Itterate(by using cursors)
		Iterator i = al.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("...... 3 way.......");
		// 3. way (by using get method)
		int size = al.size();
		for (int j = 0; j < size; j++) {
			System.out.println(al.get(j));
		}

	}

}


