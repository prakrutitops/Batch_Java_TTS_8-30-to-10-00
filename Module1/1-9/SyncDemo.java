package com.a19;

class Sender
{
	
	public void send(String msg)
	{
		
		System.out.println("sending "+msg);

			
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println(msg+" sent ");
		
		
	}
	
}

class Threadsend extends Thread
{
	String msg;
	Sender sender;
	
	public Threadsend(String msg,Sender sender) 
	{
		// TODO Auto-generated constructor stub
		this.msg=msg;
		this.sender=sender;
	}
	public void run()
	{
		synchronized (sender) 
		{
			sender.send(msg);
		}
		
	}
}

public class SyncDemo 
{
	public static void main(String[] args) {
		
		Sender sender =new Sender();
		Threadsend t1 =new Threadsend("Hii", sender);
		Threadsend t2 =new Threadsend("Byee", sender);
	
		t1.start();
		t2.start();
	}
}
