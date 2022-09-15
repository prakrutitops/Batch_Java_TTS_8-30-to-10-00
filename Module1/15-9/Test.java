package com.b;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.*;

public class Test 
{
	JFrame frame;
	JButton btn;
	JLabel l1,l2;
	static JTextField t1;
	static JPasswordField t2;
	static String number;
	static String password;
		
	public Test() 
	{
		frame = new JFrame("Tops App");
		
		btn =new JButton("Submit");
		btn.setBounds(100, 100, 100, 20);
		
		t1 =new JTextField();
		t1.setBounds(161, 38, 86, 20);
		
		t2=new JPasswordField();
		t2.setBounds(161, 66, 86, 20);
		
		l1 =new JLabel("Mobile Number:");
		l1.setBounds(55, 41, 146, 14);
		
		l2=new JLabel("Password:");
		l2.setBounds(55, 69, 146, 14);
		
		frame.add(l1);
		frame.add(l2);
		frame.add(btn);
		frame.add(t1);
		frame.add(t2);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
		
		
		
		btn.addActionListener(new ActionListener() 
		{
			
			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent e) 
			{				
				 number = t1.getText().toString();
				 password=  t2.getText().toString();
					
				System.out.println("\n Your Mobile Number is: "+number+" \n "+"Your Password is: "+password);
			
				try 
				{
					//FileOutputStream fout = new FileOutputStream("/Users/paritasarvaiya/Desktop/Testing/Logs.txt");

					FileOutputStream fout = new FileOutputStream("E://xyz.txt");
					
					String numtext="Your Mobile Number is:";
					fout.write(numtext.getBytes());
					fout.write(number.getBytes());
					
					String passtext="Your Password is:";
					fout.write(passtext.getBytes());
					fout.write(password.getBytes());

				}
				catch(Exception e1)
				{
					System.out.println(e1);
				}
				System.out.println("Success");
			}
		});
		
	}
	
	public static void main(String[] args) throws IOException 
	{
		
		new Test();
		
	
	}

	
	
}
