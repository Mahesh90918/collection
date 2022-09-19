package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class ComaSeparateValue {

	public String getSeparate(List<String> list) {
		StringBuilder sb = new StringBuilder();
		for (String str : list) {
			if (sb.length() != 0) {
				sb.append(",");
			}
			sb.append(str);
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		LinkedList<String> lk1 = new LinkedList<String>();
		lk1.add("Zero");
		lk1.add("first");
		lk1.add("second");
		lk1.add("third");
		lk1.add("fourth");
		lk1.add("fifth");
		lk1.add("six");
		lk1.add("seven");
		lk1.add("eight");
		System.out.println(lk1);
		ComaSeparateValue com = new ComaSeparateValue();
		System.out.println(".....coma separate value....");
		System.out.println(com.getSeparate(lk1));
	}
}
