package model;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/hello2")
public class HelloController extends HttpServlet{
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
    {
        res.setContentType("text/html");
        PrintWriter out=res.getWriter();
        
        String s1=req.getParameter("t1");
        
        HelloModel h1=new HelloModel();
        String result=h1.greet(s1);
        out.println("<h1>"+result+"<h1>");
    }

}