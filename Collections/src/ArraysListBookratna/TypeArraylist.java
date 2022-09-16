package ArraysListBookratna;

import java.util.ArrayList;
import java.util.Collections;

import ArrayList1.vegitable;

public class TypeArraylist {
	public static void main(String[] args) {
		vegitable e = new vegitable("brigel");
		ArrayList al = new ArrayList(Collections.nCopies(5, e));
		for (Object veg : al) {
			System.out.println(veg);
		}
		ArrayList al1 = new ArrayList<>(Collections.nCopies(3, e));
//		Collections.nCopies(3, e);
		System.out.println("..............");
		for (Object object : al1) {
			System.out.println(object);
		}
		int a = 10;
		//System.out.println(a++ + a++);//21
		//System.out.println(a++ + ++a);//22
		//System.out.println(a-- + --a);//18
		System.out.println(a-- + a--);//19
		
	}
}
