package ArrayList1;

import java.util.ArrayList;

public class Test2Super {
	public static void main(String[] args) {
		vegitable v=new vegitable("potato");
		fruits f=new fruits("Apple");
		groceries g=new groceries("table");
		ArrayList al = new ArrayList<>();
		al.add(v);
		al.add(f);
		al.add(g);
		System.out.println(al);
		System.out.println("Contains :"+al.contains(v));
		// toString implementation
		for (Object o : al) {
			if( o instanceof Integer)
				System.out.println(o.toString());
			if(o instanceof Character)
				System.out.println(o.toString());
			if(o instanceof vegitable) {
				vegitable v1=(vegitable)o;
				System.out.println(v1.vegi+"   :Add another one like that   :"+v1.vegi);
			}if(o instanceof fruits) {
				fruits f1= (fruits) o;
				System.out.println(f1.fruits+" :"+f1.fruits+" :"+f1.hashCode());
			}if(o instanceof groceries) {
				groceries g1= (groceries) o;
				System.out.println(g1.itms+" :"+g1.itms+" :"+g1.hashCode());
			}
		}
	}
}
