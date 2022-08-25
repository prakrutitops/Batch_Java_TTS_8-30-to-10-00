package com.a258;

public class StaticEx 
{
	//non-static: it will assign new memory allocation everytime
	//static :it will use old memory and change the value[reuse]
	
	static int count=0;
	
	public StaticEx() 
	{
		count++;
		System.out.println(count);
	}
	
	public static void main(String[] args) 
	{
		StaticEx s1 =new StaticEx();
		StaticEx s2 =new StaticEx();
		StaticEx s3 =new StaticEx();
		
	}
}
