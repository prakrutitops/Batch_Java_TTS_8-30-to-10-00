package com.a308;

public class StringExtraExc 
{
	public static void main(String[] args) {
		
		
		String a="tops";
		String b ="TECH";
		String c="  aa  ";
		
		String data="Java is a programming language. Java is a Platform. Java is Best";
		
		System.out.println(a.toUpperCase());
		System.out.println(b.toLowerCase());
		System.out.println(c.trim());
		System.out.println(a.charAt(0));
		
		System.out.println(data.replace("Java", "Tops"));
		
		System.out.println(a.startsWith("to"));
		System.out.println(a.endsWith("a"));
		
	}
}
