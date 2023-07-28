/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu.dto;



import java.util.Scanner;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;

/**
 *
 * @author nagar
 */
public class MenuInsert {
    public static void main(String...ar)
 {
     Configuration c1=new Configuration();
     Configuration c2=c1.configure();
     SessionFactory sf=c2.buildSessionFactory();
     Session session=sf.openSession();
     Transaction tx=session.beginTransaction();
      Scanner sc= new Scanner(System.in);
     System.out.println("Enter dish id: ");
        int dishId= sc.nextInt();
        System.out.println("Enter dish name: ");
        String dishName = sc.next();
        System.out.println("Enter description: ");
        String description = sc.next();
        System.out.println("Enter offer: ");
        String offer = sc.next();
        System.out.println("Enter price: ");
        int price = sc.nextInt();
        
        Menu ch=new Menu(dishId, dishName, description,offer, price);
 
     session.save(ch);
     tx.commit();
     session.close();
     System.out.println("record inserted");
 }
}

    

