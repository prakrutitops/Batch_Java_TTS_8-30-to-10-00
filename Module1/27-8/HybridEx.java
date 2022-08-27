package com.a278;

class M
{
	void m() 
	{
		System.out.println("M Executed");
	}
}
class N extends M
{
	void n() 
	{
		System.out.println("N Executed");
	}
}
interface S
{
	void s();
	
}
class Y extends N implements S
{
	void y() 
	{
		System.out.println("Y Executed");
	}

	@Override
	public void s() {
		// TODO Auto-generated method stub
		System.out.println("S Executed");
	}
}

public class HybridEx 
{
	public static void main(String[] args) {
		
		Y y =new Y();
		
		y.m();
		y.n();
		y.s();
		y.y();
		
	}
}
