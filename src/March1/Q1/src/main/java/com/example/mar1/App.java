package com.example.mar1;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class App
{
    public static void main( String[] args )
    {
        Configuration cfg= new Configuration().configure("hibernate.cfg.xml");
        SessionFactory factory= cfg.buildSessionFactory();
        Session session= factory.openSession();
        Transaction t= session.beginTransaction();
        Student s= new Student();
        s.setName("Meenal");
        s.setEmail("meenalpandey@gmail.com");
        Address a= new Address();
        a.setStreet("Lohardaga road");
        a.setState("Jharkhand");
        a.setCity("Gumla");
        s.setAddress(a);
        a.setStudent(s);
        session.save(s);
        t.commit();
        session.close();
        System.out.println("saved successfully");
    }
}
