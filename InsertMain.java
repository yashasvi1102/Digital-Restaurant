package manager.dto;
import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.util.Scanner;

public class InsertMain
{
    public static void main(String...ar)
    {
        SessionFactory sf=new Configuration().configure().buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Manager id: ");
        String Id= sc.next();
        System.out.println("Enter Manager password: ");
        String password = sc.next();
        Manager mng=new Manager(Id,password);
        session.save(mng);
        tx.commit();
        session.close();
        System.out.println("Record Inserted Successfully");
    }
}