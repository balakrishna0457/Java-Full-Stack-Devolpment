package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*; 
import java.io.IOException;
import java.io.PrintWriter;

import model.HelloModel;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("username");

        HelloModel model = new HelloModel();
        String message = model.getGreeting(name);

        // Print response directly (view logic here)
        out.println("<html><body>");
        out.println("<h2>" + message + "</h2>");
        out.println("</body></html>");
    }
}