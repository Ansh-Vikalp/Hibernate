package com.wipro.service.Admin;

import org.hibernate.cfg.Configuration;

import com.wipro.bean.Department;

import org.hibernate.Transaction;

import org.hibernate.Session;

import org.hibernate.SessionFactory;

public class DeprtmentAdmin {
    public static void main(String[] args) {
        System.out.println("Welcome to Department Admin");
        // code for department admin functionalities here

        Configuration cfg = new Configuration().configure();
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();

        Department obj = new Department(101, "Physics", "LNCTS");

        session.save(obj);
        transaction.commit();

        System.out.println("Record inserted");
        System.out.println(obj);

        session.close();

    }
}
