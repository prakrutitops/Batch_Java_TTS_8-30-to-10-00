package com.collection;

import java.util.LinkedHashSet;

public class LinkedHashSEtDemo {
	public static void main(String[] args) {
		LinkedHashSet lhs = new LinkedHashSet<>();
		lhs.add("TOPS");
		lhs.add('H');
		lhs.add(10);
		// insertion order is not maintain in set
		//but its LinkedHasSet 
		//so insertion order is maintain
		System.out.println(lhs);
	}
}
