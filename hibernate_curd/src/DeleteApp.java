import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteApp {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        int studentId = 1;
        Student student = session.get(Student.class, studentId);

        if (student != null) {
            session.delete(student);
            System.out.println("Record Deleted Successfully!");
        } else {
            System.out.println("Student not found!");
        }

        tx.commit();
        session.close();
        factory.close();
    }
}
