package com.wipro.service;

import com.wipro.bean.Address;
import com.wipro.bean.Student;
import com.wipro.dao.StudentDAO;

public class StudentService {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();

        Address address = new Address(101, "Gardanibagh, Road no-16 ", "Patna", "800002");
        Student student = new Student(701, "Kamala", "CA", address);

        System.out.println("Result: " + dao.insertStudent(student));
        System.out.println(student);
    }
}
