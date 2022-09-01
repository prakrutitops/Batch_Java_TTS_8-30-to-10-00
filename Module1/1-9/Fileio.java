package com.a19;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Fileio 
{
	public static void main(String[] args) throws IOException 
	{
		
		//FileOutputStream-write
		//FileInputStream-read
		
		
		
			String s="welcome to tops";
			FileOutputStream fout  = new FileOutputStream("E://parita.txt");
			fout.write(s.getBytes());
			System.out.println("Success");
		
		
	}
}
