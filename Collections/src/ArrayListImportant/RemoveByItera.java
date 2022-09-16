package ArrayListImportant;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveByItera {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("siva");
		al.add("shan");
		al.add("sriman");
		al.add("mahesh");
		al.add("shanakar");
		al.add("subash");
		System.out.println("Before data :" + al);
		Iterator<String> itr = al.iterator();
		// 3. multiple removing
		while (itr.hasNext()) {

			if ("mahesh".equals(itr.next())) {
				itr.remove();
			}
			if ("shan".equals(itr.next())) {
				itr.remove();
			}
		}
		System.out.println("After :" + al);
	}
}