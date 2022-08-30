package com.a308;

abstract class Tops
{
	abstract void a();//abstract method
	
	void b()
	{
		System.out.println("b accessed");
	}
}

class Tops2 extends Tops
{

	@Override
	void a() 
	{
		// TODO Auto-generated method stub
		System.out.println("a accessed");
	}
	
}

public class AbstractionEx 
{
	public static void main(String[] args) {
		
		
		Tops2 t = new Tops2();
		t.a();
		t.b();
		
	}
}

//normal class -abstract method is not allowed

