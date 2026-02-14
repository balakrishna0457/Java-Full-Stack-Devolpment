package ex2;



import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/sessioncheck")
public class Sessioncheck extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		HttpSession session=req.getSession();
		session.setAttribute("uname", "kumar");
		out.println(session.getAttribute("uname"));
		out.println(session.getId());
		session.setMaxInactiveInterval(60);
		
		
		
		
	}

}