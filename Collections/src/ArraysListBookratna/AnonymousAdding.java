package ArraysListBookratna;

import java.util.ArrayList;

public class AnonymousAdding {
	public static void main(String[] args) {
		ArrayList al = new ArrayList<>() {

			{
				add("mahesh");
				add("unukuru");
			}

		};
		System.out.println(al);
	}
}
