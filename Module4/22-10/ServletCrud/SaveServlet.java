import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SaveServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		
		resp.setContentType("text/html");
		PrintWriter out =resp.getWriter();
		
		String fname =req.getParameter("name");
		String lname =req.getParameter("surname");
		String email =req.getParameter("email");
		String pass =req.getParameter("pass");
		String cpass =req.getParameter("cpass");
		
		if(pass.equals(cpass))
		{
		
				Model m =new Model();
				m.setFname(fname);
				m.setLname(lname);
				m.setEmail(email);
				m.setPass(pass);
				
				int status = UserDao.SaveData(m);
		
				if(status>0)
				{
					resp.sendRedirect("ViewServlet");
				}
				else
				{
					resp.sendRedirect("404.html");
				}
		
		}
		else
		{
			out.print("Your Password and confirm password are not same");
		}
	}
}
