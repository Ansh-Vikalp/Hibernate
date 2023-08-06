package com.example.Service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.example.bean.Student;

public class StudentTester {
    public static void main(String[] args) {
        Configuration cfg = new Configuration().configure("myConfig.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction trans = session.beginTransaction();

        Student s1 = new Student(308, "Hariom Mishra", "B.Pharma");

        session.save(s1);

        trans.commit();
        System.out.println("Record Inserted");
        session.close();
    }
}
