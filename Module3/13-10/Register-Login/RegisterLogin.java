import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.*;

public class RegisterLogin implements ActionListener
{
	
	
	JFrame frame;
	JButton reg,login;
	JLabel l1;
	
	
	public RegisterLogin() 
	{
		// TODO Auto-generated constructor stub
		
		frame =new JFrame();
		
		reg=new JButton("Sign up");
		reg.setBounds(144, 55, 101, 38);
		
		login =new JButton("Login");
		login.setBounds(144, 125, 101, 38);
		
		l1 =new JLabel("Welcome");
		l1.setBounds(166, 11, 61, 38);
		
		reg.addActionListener(this);
		login.addActionListener(this);
		
		
		frame.add(reg);
		frame.add(login);
		frame.add(l1);
		frame.setSize(400,400);
		frame.setLayout(null);
		frame.setVisible(true);
		
		
	}
	
	public static void main(String[] args) 
	{
		
		new RegisterLogin();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		
			Operations o =new Operations();
			if(e.getSource()==reg)
			{
				o.register();
			}
			if(e.getSource()==login)
			{
				o.login();
			}
	}
}

class Operations
{
	
		String host="jdbc:mysql://localhost:3306/";
		String dbname="regsys";
		String url=host+dbname;
		
		JFrame registerframe,loginframe;
		JTextField Uname,Fname,Email;
		JPasswordField pass;
		JLabel  Un, Fn, Em, Ps, Er;
		JButton Log, Sig;
		
		public void register()
		{
			registerframe =new JFrame();
			
				
			Un = new JLabel("Userame");
			Un.setBounds(44, 25, 70, 17);
			
			Ps = new JLabel("Password");
			Ps.setBounds(44, 67, 70, 17);
			
			Fn = new JLabel("Full Name");
			Fn.setBounds(44, 107, 70, 17);
			
			Em = new JLabel("Email Id");
			Em.setBounds(44, 145, 70, 17);
			
			
			Uname = new JTextField();
			Uname.setBounds(115, 22, 195, 20);
			
			pass = new JPasswordField();
			pass.setBounds(115, 64, 195, 20);
			
			Fname = new JTextField();
			Fname.setBounds(115, 104, 195, 20);
			
			Email = new JTextField();
			Email.setBounds(115, 142, 195, 20);
			
			
			Sig = new JButton("Sign Up");
			Sig.setBounds(115, 188, 89, 23);
			
			Sig.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
						String name =Uname.getText().toString();
						String pass1= pass.getText().toString();
						String email =Email.getText().toString();
						String fname =Fname.getText().toString();
						
						
						try 
						{
							Class.forName("com.mysql.jdbc.Driver");
							Connection con = DriverManager.getConnection(url,"root","");
							String sql="Insert into info values(null,'"+name+"','"+pass1+"','"+email+"','"+fname+"') ";
							
							Statement stmt = con.createStatement();
							
							int status =stmt.executeUpdate(sql);
							
							if(status>0)
							{
								registerframe.setVisible(false);
							}
							else
							{
								System.out.println("Error");
							}
							
						}
						catch (Exception e1) 
						{
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						
			}
			});
			
			
			registerframe.add(Un);
			registerframe.add(Ps);
			registerframe.add(Fn);
			registerframe.add(Em);
			registerframe.add(Uname);
			registerframe.add(pass);
			registerframe.add(Fname);
			registerframe.add(Email);
			registerframe.add(Sig);
			registerframe.setSize(500,500);
			registerframe.setLayout(null);
			registerframe.setVisible(true);
		}
		public void login()
		{
			loginframe =new JFrame();
			String iun, ips;
			
			Un = new JLabel("Userame");
			Un.setBounds(44, 25, 70, 17);
			
			Ps = new JLabel("Password");
			Ps.setBounds(44, 67, 70, 17);
			
			Uname = new JTextField();
			Uname.setBounds(115, 22, 195, 20);
			
			pass = new JPasswordField();
			pass.setBounds(115, 64, 195, 20);
			
			Log = new JButton("Log In");
			Log.setBounds(115, 188, 89, 23);
			
			Log.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
					String iun, ips;
					String name =Uname.getText().toString();
					String pass1 =pass.getText().toString();
					
					
					try 
					{
						Class.forName("com.mysql.jdbc.Driver");
						Connection con=	(Connection)DriverManager.getConnection(url,"root","");
						String sql="select uname,password from info where uname ='"+name+"' ";
						
						Statement stmt =con.createStatement();
						
						ResultSet set =stmt.executeQuery(sql);
						
						if(set.next())
						{
							
							iun = set.getString(1);
							ips = set.getString(2);
							
							if(ips.equals(pass1))
							{
								JOptionPane.showMessageDialog(loginframe, "Login Successfull");
								loginframe.setVisible(false);
							}
							else
							{
								JOptionPane.showMessageDialog(loginframe, "Wrong Passowrd!!\nLogin unsuccessfull");
							}
							
						}
						else
						{
							JOptionPane.showMessageDialog(loginframe,"No user found, username invalid");
						}
						
					}
					catch (Exception e1) 
					{
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					
					
					
				}
			});
			
			
			
			loginframe.add(Un);
			loginframe.add(Ps);
			loginframe.add(Uname);
			loginframe.add(pass);
			loginframe.add(Log);
			loginframe.setSize(500,500);
			loginframe.setLayout(null);
			loginframe.setVisible(true);
		}
		
	
}
