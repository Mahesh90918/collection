package ArraysListBookratna;

import java.util.ArrayList;
import java.util.Collections;

public class addAll {
	public static void main(String[] args) {
		ArrayList al = new ArrayList<>();
		String str[] = { "mahesh", "lakkupuram", "village" };
		Collections.addAll(al, str);
		System.out.println(al);
	}
}
