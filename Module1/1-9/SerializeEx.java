package com.a19;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeEx 
{
	public static void main(String[] args) throws IOException 
	{
		
		Student s1 =new Student(101,"Tops");
		FileOutputStream fout =new FileOutputStream("E://harsh.txt");
		ObjectOutputStream out =new ObjectOutputStream(fout);
		out.writeObject(s1);
		
		System.out.println("Success");
		
	}
}
