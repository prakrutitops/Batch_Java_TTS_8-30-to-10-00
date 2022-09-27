package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraListDemo2 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList<>();
		
		al.add("TOPS");
		al.add(10);
		al.add('H');

		System.out.println(al);
		
		Iterator i1 = al.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());;
		}
	}
}
