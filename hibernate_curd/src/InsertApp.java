import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertApp {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        Student s1 = new Student(1, "Anil", 90);
        session.save(s1);

        tx.commit();
        session.close();
        factory.close();
        System.out.println("Record Inserted Successfully!");
    }
}
