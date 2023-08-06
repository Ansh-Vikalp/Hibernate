package com.wipro.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wipro.bean.Student;

public class StudentDAO {
    private SessionFactory sf;

    public StudentDAO() {
        Configuration cfg = new Configuration().configure();
        sf = cfg.buildSessionFactory();
    }

    public String insertStudent(Student stud) {
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        session.save(stud.getAddress());
        System.out.println("Address saved");
        session.save(stud);
        System.out.println("Student saved");

        tx.commit();
        session.close();
        return "Successfull";
    }
}
