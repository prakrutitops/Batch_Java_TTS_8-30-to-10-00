package com.a278;

class P
{
	void p()
	{
		System.out.println("P Executed");
	}
}
class Q extends P
{
	void q()
	{
		System.out.println("Q Executed");
	}
}
class R extends Q
{
	void r()
	{
		System.out.println("R Executed");
	}
}

public class MultilevelEx 
{
	public static void main(String[] args) {
		
		
		R r =new R();
		
		r.p();
		r.q();
		r.r();
		
	}
}
