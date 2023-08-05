package com.wipro.dao;

import org.hibernate.cfg.Configuration;

import com.wipro.bean.Department;

import org.hibernate.Transaction;
import org.hibernate.ObjectNotFoundException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class DepartmentDAO {
    private SessionFactory sf;

    public DepartmentDAO() {
        Configuration cfg = new Configuration().configure();
        sf = cfg.buildSessionFactory();
    }

    public String insertDepartment(Department dept) {

        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(dept);
        transaction.commit();
        session.close();
        return "Successfull";
    }

    public String updateDepartment(Department dept) {
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();

        session.update(dept);
        transaction.commit();
        session.close();
        return "Successfull";
    }

    // When not sure dept is transistent(created) or detached(existing)
    public String insertORupdateDepartment(Department dept) {
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();

        session.saveOrUpdate(dept);
        transaction.commit();
        session.close();
        return "Successfull";
    }

    public String deleteDepartment(int deptno) {
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();

        Department dept = new Department();
        dept.setDeptNo(deptno);

        session.delete(dept);
        transaction.commit();
        session.close();
        return "Successfull";
    }

    public Department getDepartment(int deptno) {
        Session session = sf.openSession();

        Department dept = (Department) session.get(Department.class, deptno);

        session.close();
        return dept;
    }

    public Department loadDepartment(int deptno) throws ObjectNotFoundException {
        Session session = sf.openSession();

        Department dept = new Department();
        dept = session.load(Department.class, deptno);

        session.close();
        return dept;
    }

}
