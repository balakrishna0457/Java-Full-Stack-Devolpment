package controller;

import model.Employee;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/salary")
public class EmployeeController extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String name = req.getParameter("name");
        double salary = Double.parseDouble(req.getParameter("salary"));

        Employee emp = new Employee(name, salary);

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        out.println("<h2>Salary Slip</h2>");
        out.println("Name: " + emp.getName() + "<br>");
        out.println("Basic Salary: " + emp.getBasic() + "<br>");
        out.println("HRA: " + emp.getHra() + "<br>");
        out.println("DA: " + emp.getDa() + "<br>");
        out.println("<b>Net Salary: " + emp.getNet() + "</b>");
    }
}