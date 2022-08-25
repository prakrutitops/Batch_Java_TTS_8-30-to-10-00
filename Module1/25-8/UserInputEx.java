package com.a258;

import java.util.Scanner;

public class UserInputEx 
{
	public static void main(String[] args) 
	{
		
		//Classname objname =new classname();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your id");
		int id=sc.nextInt();
	
		System.out.println("Enter your Name");
		String name =sc.next();
		
		System.out.println("Enter your salary");
		double salary =sc.nextDouble();
		
		if(salary>30000)
		{
			System.out.println("It's Good");
		}
		else
		{
			System.out.println("Need to Improve");
		}
		
		//System.out.println(id+" "+name+" "+salary);
		
		
		
	}
}
