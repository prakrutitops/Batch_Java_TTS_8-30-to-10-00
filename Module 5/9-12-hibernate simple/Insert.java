package com.controller;

import java.util.Scanner;

import com.dao.Dao;
import com.model.Tops;

public class Insert 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Your Name");
		String name = sc.next();
		
		System.out.println("Enter Your Surname");
		String surname = sc.next();
		
		System.out.println("Enter Your Email");
		String email = sc.next();
		
		Tops t =new Tops();
		t.setName(name);
		t.setSurname(surname);
		t.setEmail(email);
		
		new Dao().Insert(t);
	}
}
