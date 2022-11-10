package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
	
	public static int deletedata(int id)
	{
		int status = 0;
		
		Connection con =UserDao.getconnect();
		
			try 
			{
				PreparedStatement ps =con.prepareStatement("delete from info where id =?");
				ps.setInt(1,id);
				
				status = ps.executeUpdate();
				
				
			}
			catch (Exception e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		return status;
	}
	
	public static Model getdetailbyid(int id)
	{

			Model m=new Model();

		
			Connection con =UserDao.getconnect();
			
			try 
			{
				Class.forName("com.mysql.jdbc.Driver");
				PreparedStatement ps =con.prepareStatement("select * from info where id =?");
				ps.setInt(1,id);
				
				ResultSet set =ps.executeQuery();
				
				if(set.next())
				{
					
					int id2 =set.getInt(1);
					String name =set.getString(2);
					String surname =set.getString(3);
					String email =set.getString(4);
					String pass = set.getString(5);
				
					
					m.setId(id2);
					m.setName(name);
					m.setSurname(surname);
					m.setEmail(email);
					m.setPass(pass);
					
				}
				
				
				
				
			
			} 
			catch (Exception e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		
		
		return m;
	}
		
	
	
	public static int Updatedata(Model m)
	{
		int status =0;
		
		Connection con =UserDao.getconnect();
		
		String sql ="update info set name =? , surname =?,email =?, password =? where id =?";
		try 
		{
			PreparedStatement ps =con.prepareStatement(sql);
			ps.setString(1,m.getName());
			ps.setString(2,m.getSurname());
			ps.setString(3,m.getEmail());
			ps.setString(4,m.getPass());
			ps.setInt(5, m.getId());
			status = ps.executeUpdate();
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
	
	}
	
	
}
