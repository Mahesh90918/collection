package ArrayListImportant;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveEleUsingIter {
	public static void main(String[] args) {
		String remove = "mahesh";
		ArrayList al = new ArrayList();
		al.add("siva");
		al.add("shan");
		al.add("sriman");
		al.add("mahesh");
		al.add("shanakar");
		al.add("subash");
		System.out.println("Before data :" + al);
		Iterator<String> itr = al.iterator();
		//1. Single removing
//		while (itr.hasNext()) {
//			if (remove.equals(itr.next())) {
//				itr.remove();
//			}
//		}
		//2. single removing
		while (itr.hasNext()) {
			if ("subash".equals(itr.next())) {
				itr.remove();
			}
		}
		
		System.out.println("After Removing  :" + al);
	}
}
