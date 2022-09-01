package com.a19;

public class ThrowEx 
{
	static void validate(int age)
	{
		if(age>18)
		{
			System.out.println("Eligible to vote");
		}
		else
		{
			try 
			{
				throw new MyExeception();
			}
			catch (MyExeception e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("xyz");
	}
	
	public static void main(String[] args) 
	{
		
		validate(15);
		System.out.println("xyz");
	}
}
