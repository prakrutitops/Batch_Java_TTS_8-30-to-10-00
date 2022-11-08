package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.Model;

public class UserDao 
{
	
	public static Connection getconnect()
	{
		
		Connection con =null;
		
		
			try 
			{
				Class.forName("com.mysql.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/servletcrud","root","");

			} 
			catch (Exception e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		return con;
		
	}
	
	public static int Savedata(Model m)
	{
		int status =0;
		
		
		Connection con =UserDao.getconnect();
			
		try 
		{
			PreparedStatement ps =con.prepareStatement("insert into info(name,surname,email,password) values (?,?,?,?)");
			ps.setString(1,m.getName());
			ps.setString(2,m.getSurname());
			ps.setString(3,m.getEmail());
			ps.setString(4,m.getPass());
			
			status =ps.executeUpdate();
		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
	}
	
	public static List<Model>viewdata()
	{
		List<Model>list = new ArrayList<Model>();
		
		Connection con = UserDao.getconnect();
		
		try 
		{
			PreparedStatement ps = con.prepareStatement("select * from info");
			ResultSet set =ps.executeQuery();
			while(set.next())
			{
				Model m =new Model();
				m.setId(set.getInt(1));
				m.setName(set.getString(2));
				m.setSurname(set.getString(3));
				m.setEmail(set.getString(4));
				m.setPass(set.getString(5));
				
				list.add(m);
			}
		
		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	
}
