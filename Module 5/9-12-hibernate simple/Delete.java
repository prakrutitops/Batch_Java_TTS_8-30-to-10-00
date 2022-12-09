package com.controller;

import java.util.Scanner;

import com.dao.Dao;
import com.model.Tops;

public class Delete 
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Tops p = new Tops();
		System.out.println("Enter id:");
		p.setId(sc.nextInt());
		new Dao().Delete(p);
		
	}
	
	
}
