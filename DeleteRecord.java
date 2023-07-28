package order.dto;

import Menu.dto.*;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import java.util.Scanner;
public class DeleteRecord {
    public static void main(String...ar)
 {
     SessionFactory sf=new Configuration().configure().buildSessionFactory();
     Session session=sf.openSession();
     Transaction tx=session.beginTransaction();
     Scanner sc=new Scanner(System.in);
     System.out.println("enter dish id to load record");
     int dishid=sc.nextInt();
     Menu menu=(Menu)session.get(Menu.class,dishid);
     if(menu==null)
     {
         System.out.println("record not found");
     }
     else
     {
         session.delete(menu);
         tx.commit();
         System.out.println("record deleted!!!");
     }
     
  
     session.close();
   
 }
}

    

