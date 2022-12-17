package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class convertArrayToList {
	public static void main(String[] args) {
		Integer [] a = { 1, 2,10, 6, 4, 3, 4, 3, 6, 7 };
		Set<Integer> i = new HashSet<>(Arrays.asList(a));
		System.out.println(i);
		int [] a1 = { 1, 2,10, 6, 4, 3, 4, 3, 6, 7 };
		Set<Integer> i1 = new HashSet<>(Arrays.asList(a));
		for (Integer integer : i1) {
			i1.add(integer);
		}
		System.out.println(i1);
		int [] a2 = { 1, 2,10, 6, 4, 3, 4, 3, 6, 7 };
		Set<Integer> i2 = new HashSet<>(Arrays.asList(a));
		for (int j = 0; j < a2.length; j++) {
			i2.add(j);
		}
		System.out.println(i1);
	
	}
}
