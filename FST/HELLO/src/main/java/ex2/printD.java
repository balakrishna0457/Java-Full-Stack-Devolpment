package ex2;

import java.io.IOException;
import jakarta.servlet.annotation.WebServlet;
import java.io.PrintWriter;
import java.util.Date;
import jakarta.servlet.http.*;
@WebServlet("/printform")
public class printD extends HttpServlet
{

	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		String a=req.getParameter("t1");
		String b=req.getParameter("t2");
		int c=Integer.parseInt(a);
		int d=Integer.parseInt(b);
		int sum=c+d;
		out.println("Sum :"+sum);
		out.println("Sub :"+(c-d));
		out.println("mul :"+(c*d));
		out.println("Div :"+(c/d));
	}
}