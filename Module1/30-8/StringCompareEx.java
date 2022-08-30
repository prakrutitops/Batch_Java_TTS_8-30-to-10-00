package com.a308;

public class StringCompareEx 
{
	public static void main(String[] args)
	{
		
		String s1 = "sachin";//literal
		String s2 = "sachin";
		String s3 =new String("sachin");//new keyword string
		String s4 = new String("ratan");
		String s5 = new String("SACHIN");
		
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
		System.out.println(s1.equals(s4));
		System.out.println(s1.equals(s5));
		
		System.out.println(s1.equalsIgnoreCase(s5));
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		
		System.out.println(s1.compareTo(s4));
		
		
	}
}
