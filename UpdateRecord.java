package order.dto;

import Menu.dto.*;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import java.util.Scanner;
public class UpdateRecord {
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
        System.out.println("record not found to upload");
    }
    else
    {
        System.out.println(menu.getDishId()+" "+menu.getDishName()+" "+menu.getDescription()+" "+menu.getOffer()+" "+menu.getPrice()+" ");
        System.out.println("--MENU--"); 
        System.out.println("1.Dish Name"); 
        System.out.println("2.Description");   
        System.out.println("3.offer"); 
        System.out.println("4.Price"); 
     
        int ch=sc.nextInt();
                switch(ch)
                {
                    case 1:
                        System.out.println("enter updated dish name ");
                        String uDName=sc.next();
                        menu.setDishName(uDName);
                        session.update(menu);
                        System.out.println("field updated!!!");
                        break;
                    case 2:
                        System.out.println("enter udated description");
                        String uDescription=sc.next();
                        menu.setDishName(uDescription);
                        session.update(menu);
                        System.out.println("field updated!!!");
                        break;
                        
                    case 3:
                        System.out.println("enter updated offer");
                        String uOffer=sc.next();
                        menu.setDishName(uOffer);
                        session.update(menu);
                        System.out.println("field updated!!!");
                        break;
                    case 4:
                        System.out.println("enter updated price ");
                        String uPrice=sc.next();
                        menu.setDishName(uPrice);
                        session.update(menu);
                        System.out.println("field updated!!!");
                        break;

                }
    }
    tx.commit();
    session.close();
   
 }
}

    

