package com.a278;

interface Print
{
	void print();
	
	
}
interface Show
{
	void show();
}

public class MultipleEx2 implements Print,Show
{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Showing");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Printing");
	}
	
	public static void main(String[] args) {
		
		MultipleEx2 m1 =new MultipleEx2();
		
		m1.print();
		m1.show();
		
	}

}
