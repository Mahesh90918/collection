package ArrayList1;

import java.util.ArrayList;

public class SuperMarket {
	public static void main(String[] args) {
		ArrayList al = new ArrayList<>();
		al.add(new vegitable("potato"));
		al.add(new fruits("Apple"));
		al.add(new groceries("table"));
		System.out.println(al);
	
		
	}
}
