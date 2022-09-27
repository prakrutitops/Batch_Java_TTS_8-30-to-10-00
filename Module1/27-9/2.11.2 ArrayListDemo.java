package com.collection;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList al = new ArrayList<>();
		al.add("TOPS");
		al.add('H');
		al.add(null);
		al.add(7);
		al.add(7);
		al.add(7);
		al.add(null);
		System.out.println(al);
		al.add(3, "INDIA");
		System.out.println(al);
		System.out.println("DAta At Given Index(3)"+al.get(3));;
		System.out.println("Size Of ArrayList = "+al.size());;
		System.out.println("ArrayLis Is Empty Or NOt = "+al.isEmpty());;
		System.out.println("Is This DAta Available = "+al.contains("INDIA"));;
		al.remove(null);
		System.out.println(al);
		
		ArrayList al2 = new ArrayList<>();
		al2.add("TOPS");
		al2.addAll(al);
		System.out.println(al2);
		al2.clone();
		System.out.println(al2.clone());
		al2.clear();
		System.out.println(al2);
		
		System.out.println(al.subList(2, 5));;
		
		ArrayList all = new ArrayList<>(al);
		System.out.println(all);
		
		ArrayList al3 = new ArrayList<>(50);
		System.out.println(al3.size());
	}
}
