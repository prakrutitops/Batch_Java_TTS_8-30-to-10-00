package com.controller;

import java.util.Scanner;

import com.dao.Dao;
import com.model.Tops;

public class Single 
{
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		Tops p = new Tops();
		System.out.println("Enter id:");
		p.setId(sc.nextInt());
		Tops per = new Dao().getSingle(p);
		System.out.println("ID: "+per.getId()+"\tName: "+per.getName()+"\tPassword: "+per.getSurname());
		
		
	}
}
