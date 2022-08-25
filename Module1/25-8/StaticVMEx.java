package com.a258;

public class StaticVMEx 
{
	int id;
	String name;
	static String college="BVM";
	
	public StaticVMEx(int id,String name) 
	{
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
	}
	
	void display()
	{
		System.out.println(id+" "+name+" "+college);
	}
	
	 static void change()
	{
		college="GCET";
	}
	
	public static void main(String[] args) 
	{
	
		change();
		
		
		StaticVMEx s1 =new StaticVMEx(101, "Harsh");
		StaticVMEx s2 = new StaticVMEx(102, "Parita");
		
		s1.display();
		s2.display();
		
	}
}
