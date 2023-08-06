package com.wipro.service;

import java.util.List;

import com.wipro.bean.Student;
import com.wipro.dao.StudentDAO;

public class HQLTester {
    public static void main(String[] args) {

        StudentDAO dao = new StudentDAO();

        List<Student> result1 = dao.getStudents();

        System.out.println("Student Records\n");
        for (Student s : result1) {
            System.out.println(s);
        }
        System.out.println("\n***********************************************************************\n");

        List<Student> result2 = dao.getStudentsByCourse("B.Tech (CSE)");

        System.out.println("Students of B.Tech (CSE)\n");

        for (Student student : result2) {
            System.out.println(student);
        }
        System.out.println("\n***********************************************************************\n");

        List<Student> result3 = dao.getStudentsTop3();

        System.out.println("Top 3 Students\n");

        for (Student student : result3) {
            System.out.println(student);
        }
        System.out.println("\n***********************************************************************\n");

        List<String> result4 = dao.getStudentByName();

        System.out.println("Student Names\n");

        for (String student : result4) {
            System.out.println(student);
        }
        System.out.println("\n***********************************************************************\n");

        List<String> result5 = dao.getStudentByCondition(305);

        System.out.println("Conditional Fetch\n");

        for (String student : result5) {
            System.out.println(student);
        }
        System.out.println("\n***********************************************************************\n");

        List<Object[]> groupBy = dao.getStudentCountInCourse();

        System.out.println("Count of Students in Each Course");

        System.out.println("COURSE\t\t\tCount");
        for (Object[] objects : groupBy) {
            System.out.println((String) objects[0] + "\t\t" + (Long) objects[1]);

        }
        System.out.println("\n***********************************************************************\n");

        dao.updateStudent("AIMS", 307);

        System.out.println("\n***********************************************************************\n");

        dao.deleteStudent(308);

    }
}
