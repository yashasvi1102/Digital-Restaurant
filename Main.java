package feedback.dto;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;

public class Main {
    public static void main(String...ar)
 {
     Configuration c1=new Configuration();
     Configuration c2=c1.configure();
     SessionFactory sf=c2.buildSessionFactory();
     Session session=sf.openSession();
     Transaction tx=session.beginTransaction();
     Feedback fb=new Feedback(1211,"yashu","hdhgwqgdve");
     session.save(fb);
     tx.commit();
     session.close();
     System.out.println("recorded inserted");
 }

    
}
