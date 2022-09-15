package com.b;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TableEx 
{
	JFrame f;  
	 String data[][]=
		 { 
			 	{"101","Amit","670000"},    
			 	{"102","Jai","780000"},    
			 	{"101","Sachin","700000"},
				{"101","Amit","670000"},    
			 	{"102","Jai","780000"},    
			 	{"101","Sachin","700000"},
				{"101","Amit","670000"},    
			 	{"102","Jai","780000"},    
			 	{"101","Sachin","700000"},
				{"101","Amit","670000"},    
			 	{"102","Jai","780000"},    
			 	{"101","Sachin","700000"},
				{"101","Amit","670000"},    
			 	{"102","Jai","780000"},    
			 	{"101","Sachin","700000"},
			 	{"101","Sachin","700000"},
				{"101","Amit","670000"},    
			 	{"102","Jai","780000"}
         };   
	
	public TableEx() 
	{
		// TODO Auto-generated constructor stub
	
		f = new JFrame();
		
		String col[]= {"ID","NAME","SALARY"};
		
		JTable tb =new JTable(data,col);
		tb.setBounds(30,40,200,300);
		JScrollPane jp =new JScrollPane(tb);
		f.add(jp);
		f.setSize(300,300);
		f.setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		
		new TableEx();
		
	}
}
