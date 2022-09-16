package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class example3 {
	public static void main(String[] args) {
		ArrayList a = new ArrayList<>();
		a.add(100);
		a.add(200);
		a.add(300);

		ArrayList a1 = new ArrayList<>(a);
		//a1.addAll(a);
		for (Object object : a1) {
			System.out.println(a1);
		}
		
		Iterator i = a1.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
