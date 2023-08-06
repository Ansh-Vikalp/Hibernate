package com.wipro.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.wipro.bean.Student;

public class StudentCriteriaDAO {
    SessionFactory sf;

    public StudentCriteriaDAO() {
        Configuration cfg = new Configuration().configure("myConfig.cfg.xml");
        sf = cfg.buildSessionFactory();
    }

    public List<Student> getAllStudents() {

        Session session = sf.openSession();

        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<Student> cr = cb.createQuery(Student.class);
        Root<Student> root = cr.from(Student.class);

        cr.select(root);

        Query<Student> query = session.createQuery(cr);

        return query.list();
    }

    public List<Student> getStudentsByCourse(String course) {

        Session session = sf.openSession();

        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<Student> cr = cb.createQuery(Student.class);
        Root<Student> root = cr.from(Student.class);

        cr.select(root);

        Predicate predicate = cb.equal(root.get("course"), course);
        cr.where(predicate);

        Query<Student> query = session.createQuery(cr);

        return query.list();
    }
}
