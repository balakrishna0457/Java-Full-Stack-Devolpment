package Studentdao;

import java.sql.*;
import java.util.*;
import model.Student;

public class StudentDAO {
    public List<Student> getAllStudents() {
        List<Student> list = new ArrayList<>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/college", "root", "Bala0457");

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM stu1");

            while (rs.next()) {
                Student s = new Student(rs.getInt(1), rs.getString(2), rs.getInt(3));
                list.add(s);
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
}