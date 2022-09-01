package com.a19;

public class MyExeception extends Exception
{
		public MyExeception()
		{
			System.out.println("After Error code is executed");
		}
		
		public static void main(String[] args)
		{
			
			MyExeception m1 =new MyExeception();
			
			
		}
	
}
