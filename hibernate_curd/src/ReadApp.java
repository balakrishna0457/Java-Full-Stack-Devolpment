import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadApp {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = factory.openSession();

        int studentId = 1;
        Student student = session.get(Student.class, studentId);

        if (student != null) {
            System.out.println("Student Found: " + student);
        } else {
            System.out.println("No student found with id " + studentId);
        }

        session.close();
        factory.close();
    }
}
