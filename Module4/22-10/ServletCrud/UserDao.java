import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
	
	
	public static int SaveData(Model m)
	{
		int status =0;
		
		Connection con =UserDao.getconnect();
		
		String sql ="insert into info (name,surname,email,password) values (?,?,?,?)";
		try 
		{
			PreparedStatement ps =con.prepareStatement(sql);
			ps.setString(1,m.getFname());
			ps.setString(2,m.getLname());
			ps.setString(3,m.getEmail());
			ps.setString(4,m.getPass());
		
			status = ps.executeUpdate();
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
	
	}
	
	public static  List<Model>viewdata()
	{
		
		Connection con =UserDao.getconnect();
		List<Model>list = new ArrayList<Model>();
		try 
		{
			PreparedStatement ps = con.prepareStatement("select * from info");
			
			ResultSet set =ps.executeQuery();
			
			
			while(set.next())
			{
				int id =set.getInt(1);
				String name =set.getString(2);
				String surname =set.getString(3);
				String email =set.getString(4);
				String pass =set.getString(5);
				
				Model m =new Model();
				m.setId(id);
				m.setFname(name);
				m.setLname(surname);
				m.setEmail(email);
				m.setPass(pass);
				
				list.add(m);
				
			}
			
		
		
		}
		
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return list;
	}
		
}
