package controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import model.StudentModel;

@WebServlet("/student1")
public class StudentController extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        String name = req.getParameter("name");  // corrected from "t1"
        int m1 = Integer.parseInt(req.getParameter("mark1"));
        int m2 = Integer.parseInt(req.getParameter("mark2"));
        int m3 = Integer.parseInt(req.getParameter("mark3"));

        StudentModel model = new StudentModel();
        model.calculate(m1, m2, m3);

        out.println("<html><body>");
        out.println("<h2>Student Report</h2>");
        out.println("<p>Name: " + name + "</p>");
        out.println("<p>Total Marks: " + model.getTotal() + "</p>");
        out.println("<p>Average Marks: " + model.getAverage() + "</p>");
        out.println("</body></html>");
    }
}