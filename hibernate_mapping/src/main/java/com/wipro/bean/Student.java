package com.wipro.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENT_TBL")
public class Student {

    @Id
    @Column(name = "stdId")
    private int studentId;
    @Column(name = "stdName", length = 30, nullable = false)
    private String studentName;
    private String course;
    // One Student mapped to one of its Address
    // Also, this is a type of Component Mapping in hibernate
    @OneToOne
    private Address address;

    public Student() {
        super();
    }

    public Student(int studentId, String studentName, String course, Address address) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.course = course;
        this.address = address;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "\n\nStudent < ID:= " + this.studentId + " Name:= " + this.studentName + " Course:= " + this.course
                + "\n\t\tAddress < id:= "
                + this.address.getAddressId() + " Street:= " + this.address.getStreetName() + " City:= "
                + this.address.getCity()
                + " Pin:= "
                + this.address.getPin() + ">\n\t>";
    }

}
