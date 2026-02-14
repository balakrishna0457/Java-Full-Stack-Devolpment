package ex2;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/session")
public class Session extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        
        HttpSession s1 = req.getSession();

     
        s1.setAttribute("uname", "kumar");

       
        s1.setMaxInactiveInterval(60);
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        out.println("<h2>Session Created</h2>");
        out.println("<h1>Session ID: " + s1.getId() + "</h1>");
        out.println("<h1>Stored 'uname' in session: " + s1.getAttribute("uname") + "</h1>");
        out.println("<h1>Session Timeout: 60 seconds</h1>");
    }
}