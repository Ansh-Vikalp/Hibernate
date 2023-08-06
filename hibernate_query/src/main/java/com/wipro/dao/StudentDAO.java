package com.wipro.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import com.wipro.bean.*;

@SuppressWarnings("unchecked")
public class StudentDAO {

    SessionFactory sf;

    public StudentDAO() {
        Configuration cfg = new Configuration().configure("myConfig.cfg.xml");
        sf = cfg.buildSessionFactory();
    }

    public List<Student> getStudents() {
        Session session = sf.openSession();

        Query<Student> query = session.createQuery("FROM Student");

        return query.list();
    }

    public List<Student> getStudentsByCourse(String course) {
        Session session = sf.openSession();

        Query<Student> query = session.createQuery("FROM Student AS std WHERE std.course= ?0");
        query.setParameter(0, course);

        return query.list();
    }

    public List<Student> getStudentsTop3() {
        Session session = sf.openSession();

        Query<Student> query = session.createQuery("FROM Student std ORDER BY std.studentName");
        query.setMaxResults(3);

        return query.list();
    }

    public List<String> getStudentByName() {
        Session session = sf.openSession();

        Query<String> query = session.createQuery("SELECT std.studentName FROM Student std ORDER BY std.studentName");

        return query.list();
    }

    public List<String> getStudentByCondition(int id) {
        Session session = sf.openSession();

        Query<String> query = session.createQuery("SELECT std.studentName FROM Student std WHERE std.studentId > ?0");
        query.setParameter(0, id);

        return query.list();
    }

    public List<Object[]> getStudentCountInCourse() {
        Session session = sf.openSession();

        Query<Object[]> query = session
                .createQuery("SELECT  std.course ,COUNT(std.studentId) FROM Student std GROUP BY std.course");

        return query.list();
    }

    public void updateStudent(String course, int id) {
        Session session = sf.openSession();
        Transaction ts = session.beginTransaction();
        Query<?> query = session.createQuery("UPDATE Student std set std.course = ?0 WHERE std.studentId = ?1");
        query.setParameter(0, course);
        query.setParameter(1, id);

        int result = query.executeUpdate();

        System.out.println("Rows affected: " + result);
        ts.commit();
        session.close();
    }

    public void deleteStudent(int id) {
        Session session = sf.openSession();
        Transaction ts = session.beginTransaction();
        Query<?> query = session.createQuery("DELETE FROM Student std WHERE std.studentId = ?0");
        query.setParameter(0, id);

        int result = query.executeUpdate();

        System.out.println("Rows affected: " + result);
        ts.commit();
        session.close();
    }

}
