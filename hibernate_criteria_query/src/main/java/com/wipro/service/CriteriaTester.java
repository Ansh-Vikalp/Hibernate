package com.wipro.service;

import java.util.*;

import com.wipro.bean.Student;
import com.wipro.dao.StudentCriteriaDAO;

public class CriteriaTester {
    public static void main(String[] args) {

        StudentCriteriaDAO dao = new StudentCriteriaDAO();

        List<Student> result = dao.getAllStudents();
        System.out.println("Student Records");
        for (Student stud : result) {
            System.out.println(stud);
        }

        System.out.println("\n**********************************************************\n");

        List<Student> result2 = dao.getStudentsByCourse("B.Tech (CSE)");
        System.out.println("Student Records by Specific Course");
        for (Student stud : result2) {
            System.out.println(stud);
        }

        System.out.println("\n**********************************************************\n");

    }
}
