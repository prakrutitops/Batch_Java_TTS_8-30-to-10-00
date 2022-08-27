package com.a278;

class Color1
{
	String color="black";
}
class Color2 extends Color1
{
	String color="white";
	
	void display()
	{
		System.out.println(color);
		System.out.println(super.color);
	}
}

public class SuperEx 
{
	public static void main(String[] args) {
		
		Color2 c =new Color2();
		c.display();
		
	}
}
