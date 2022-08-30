package com.a308;

public class StringClassEx 
{
	public static void main(String[] args) 
	{
		
		//1.Literal String
		//2.New Keyword String
		//3.Character Array String
		
		
		String s1 ="Tops Technologies";//1
		
		String s2 =new String("Tops Technologies");//2
		
		char ch[]= {'T','O','P','S'};
		String s3 =new String(ch);
		
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		
		
	}
}
