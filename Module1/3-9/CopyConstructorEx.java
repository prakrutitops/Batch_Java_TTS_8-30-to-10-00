package com.a39;

public class CopyConstructorEx 
{
	
	int id;
	String name;
	
	public CopyConstructorEx(int id,String name)
	{
		// TODO Auto-generated constructor stub
		
		this.id=id;
		this.name=name;
	}
	
	public CopyConstructorEx(CopyConstructorEx c1)
	{
		id=c1.id;
		name=c1.name;
				
	}
	
	void display()
	{
		System.out.println(id+" "+name);
	}
	
	public static void main(String[] args) 
	{
		CopyConstructorEx c1 =new CopyConstructorEx(101,"Tops");
		CopyConstructorEx c2 =new CopyConstructorEx(c1);
		
		c1.display();
		c2.display();
		
	}
}
