import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SaveServlet extends  HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String name1 = req.getParameter("name");
		String pass1 = req.getParameter("pass");
		
		if(pass1.equals("1234"))
		{
		
		
				
				//resp.sendRedirect("google link");
				RequestDispatcher rd = req.getRequestDispatcher("xyz.html");
				rd.forward(req, resp);
				//out.print("aaaaa");
				
		
		}
		else
		{
			out.print("Your Details are not correct");
		}
	
	}
}
