package com.a278;

class A
{
	void a1()
	{
		System.out.println("A1 Executed");
	}
}
class B extends A
{
	void b1()
	{
		System.out.println("B1 Executed");
	}
}

public class SingleInEx 
{
	public static void main(String[] args) 
	{
		B b =new B();
		b.a1();
		b.b1();
	}
}
