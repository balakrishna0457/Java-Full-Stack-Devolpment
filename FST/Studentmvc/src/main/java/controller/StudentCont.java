package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import Studentdao.StudentDAO;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Student;

@WebServlet("/students")
public class StudentCont extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        StudentDAO dao = new StudentDAO();
        List<Student> list = dao.getAllStudents();

        out.println("<html><head><title>Student List</title></head><body>");
        out.println("<h2>Student Details</h2>");
        out.println("<table border='1'>");
        out.println("<tr><th>ID</th><th>Name</th><th>Marks</th></tr>");

        for (Student s : list) {
            out.println("<tr>");
            out.println("<td>" + s.getId() + "</td>");
            out.println("<td>" + s.getName() + "</td>");
            out.println("<td>" + s.getMarks() + "</td>");
            out.println("</tr>");
        }

        out.println("</table>");
        out.println("</body></html>");
    }
}


