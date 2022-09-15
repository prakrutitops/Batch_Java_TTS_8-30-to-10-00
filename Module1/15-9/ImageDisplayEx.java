package com.b;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class ImageDisplayEx extends Canvas
{
	@Override
	public void paint(Graphics g) 
	{
			// TODO Auto-generated method stub
			
			  Toolkit t=Toolkit.getDefaultToolkit();  
		      Image i=t.getImage("E://a.png");  
		      g.drawImage(i, 120,100,this);  
		      
	}
	public static void main(String[] args) 
	{
		ImageDisplayEx m=new ImageDisplayEx();  
        JFrame f=new JFrame();  
        f.add(m);  
        f.setSize(400,400);  
        f.setVisible(true);  
	}
}
