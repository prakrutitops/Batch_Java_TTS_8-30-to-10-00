package com.controller;

import java.util.List;

import com.dao.Dao;
import com.model.Tops;

public class Select 
{
	public static void main(String[] args) 
	{
		int i=0;
		List<Tops>list = new Dao().viewRecords();
		System.out.println("ID\t|\tName\t|\tSurname");
		for (Tops person : list) 
		{
			i++;
			System.out.println(person.getId()+"\t|\t"+person.getName()+"\t|\t"+person.getSurname());
			if (i==4)
			{
				System.exit(0);
			}
		}
		
	}
}
