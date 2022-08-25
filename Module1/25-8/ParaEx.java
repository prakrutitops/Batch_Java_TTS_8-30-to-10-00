package com.a258;

public class ParaEx 
{
	//global variables
	int id;
	String name;
	
	public ParaEx(int id,String name) 
	{//local variables
		// TODO Auto-generated constructor stub
		
		this.id=id;
		this.name=name;
		
	}
	
	void display()
	{
		System.out.println(id+" "+name);
	}
	
	public static void main(String[] args)
	{
		ParaEx p1 =new ParaEx(101,"Harsh");
		ParaEx p2 =new ParaEx(102,"Parita");
		
		/*System.out.println(p1.id+" "+p1.name);
		System.out.println(p2.id+" "+p2.name);*/
		
		p1.display();
		p2.display();
		
	}

}
