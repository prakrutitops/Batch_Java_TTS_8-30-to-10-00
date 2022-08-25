package com.a258;

public class ObjectEx 
{
	int id;
	String name;
	public static void main(String[] args) 
	{
		
		//Classname objname =new classname();
		
		  ObjectEx s1 = new ObjectEx();
		  ObjectEx s2 =new ObjectEx();
		
		  s1.id=101;
		  s1.name="Parita";
		  
		  s2.id=102;
		  s2.name="Harsh";
		  
		  System.out.println(s1.id+" "+s1.name);
		  System.out.println(s2.id+" "+s2.name);
		

	}

}
