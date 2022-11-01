import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
		resp.setContentType("text/html");
		PrintWriter out =resp.getWriter();
		
		String id =req.getParameter("id");
		int id2=Integer.parseInt(id);
		
		Model m =UserDao.getdetailbyid(id2);
	
		
		
		
		out.print("<form action='EditServlet2' method ='POST' >");
		
		out.print("<tr><td><input type='hidden' name='id' value='"+m.getId()+"'></td></tr>");
		
		out.print("<tr><td>Your FirstName: <input type='text' name='name' value='"+m.getFname()+"'></td></tr>");
		
		out.print("<tr><td>Your Lastname: <input type='text' name='surname' value='"+m.getLname()+"'></td></tr>");
		
		out.print("<tr><td>Your Email: <input type='email' name='email' value='"+m.getEmail()+"'></td></tr>");
		
		out.print("<tr><td> Your Password: <input type='password' name='password' value='"+m.getPass()+"'></td></tr>");
		
		out.print("<tr><td><input type='submit' value='Update' ></td></tr>");
		
		out.print("</form>");
		
		
		
	}
}
