package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveIterator {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(100);
		a.add(200);
		a.add(300);
		a.add(50);
		a.add(150);

		Iterator<Integer> itr = a.iterator();
		while (itr.hasNext()) {
			// System.out.print(itr.next() + " ");
			if (itr.next() == 50) {
//				a.remove(itr.next());list remove Method: java.util.ConcurrentModificationException
				itr.remove();// iterator remove Method
			}
			// System.out.println();
		}
		System.out.println(a);
	}
}
