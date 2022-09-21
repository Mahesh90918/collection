package EnumSet;

import java.util.Iterator;

class EnumSet {
	enum colour {
		WHITE, BLACK, BLUE, VIOLET, GREEN, READ;
	}

	public static void main(String[] args) {
		java.util.EnumSet enu = java.util.EnumSet.allOf(colour.class);
		System.out.println(enu);
		System.out.println(".....iterator......");
		Iterator<colour> itr = enu.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(".....................");
		java.util.EnumSet e1 = java.util.EnumSet.copyOf(enu);
		System.out.println("Copy of Enum  :" + e1);

		java.util.EnumSet e2 = java.util.EnumSet.complementOf(enu);
		System.out.println("Complementof :" + e2);

		java.util.EnumSet e3 = java.util.EnumSet.noneOf(colour.class);
		System.out.println("noneOf  :" + e3);
		java.util.EnumSet e4 = java.util.EnumSet.range(colour.BLACK, colour.GREEN);
		System.out.println("Range " + e4);
		java.util.EnumSet e5 = java.util.EnumSet.of(colour.BLACK);
		System.out.println(e5);
		java.util.EnumSet e6 = java.util.EnumSet.of(colour.BLACK, colour.BLUE);
		System.out.println(e6);
		java.util.EnumSet e7 = java.util.EnumSet.of(colour.BLACK, colour.BLUE, colour.GREEN);
		System.out.println(e7);
		java.util.EnumSet e8 = java.util.EnumSet.of(colour.BLACK, colour.BLACK, colour.BLUE, colour.GREEN);
		System.out.println(e8);
		System.out.println("................................");
		java.util.EnumSet enu1 = java.util.EnumSet.noneOf(colour.class);
		enu1.add(colour.BLACK);
		enu1.add(colour.BLUE);
		enu1.add(colour.GREEN);
		enu1.add(colour.VIOLET);
	//	enu1.addAll(enu);// total adding
		System.out.println(enu1);
		System.out.println(enu1.size());
		System.out.println(enu1.isEmpty());
		enu1.remove(colour.BLACK);
		System.out.println(enu1);
		boolean s=enu1.contains(colour.BLUE);
		System.out.println(s);
		System.out.println(enu1.contains(colour.VIOLET));
		
	}
}
