package order.dto;


import java.util.Scanner;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;

public class OrderInsert {
    public static void main(String...ar)
 {
     Configuration c1=new Configuration();
     Configuration c2=c1.configure();
     SessionFactory sf=c2.buildSessionFactory();
     Session session=sf.openSession();
     Transaction tx=session.beginTransaction();
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter order id: ");
        int orderId= sc.nextInt();
        System.out.println("Enter table no: ");
        int tableNo = sc.nextInt();
        System.out.println("Enter dish name: ");
        String dishName = sc.next();
        System.out.println("Enter quantity: ");
        int quantity = sc.nextInt();
        System.out.println("Enter additional info: ");
        String additionalInfo = sc.next();
        System.out.println("Enter total ampount: ");
        int totalAmount = sc.nextInt();
        
        Order od=new Order(orderId,tableNo,dishName, quantity,additionalInfo, totalAmount);
     session.save(od);
     tx.commit();
     session.close();
     System.out.println("recorded inserted");
 }
    
}
