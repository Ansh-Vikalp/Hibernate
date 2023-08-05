package com.wipro.service.Admin;

// import com.wipro.bean.Department;
import com.wipro.dao.DepartmentDAO;

public class DepartmentAdmin2 {
    public static void main(String[] args) {

        DepartmentDAO dao = new DepartmentDAO();

        // Department deptObj = new Department(102, "Chemistry", "Jabalpur");
        // Department deptObj2 = new Department(103, "Mathematics", "Bhopal");
        // Department deptObj3 = new Department(104, "English", "Hydrabad");
        // Department deptObj4 = new Department(105, "Android", "Bhopal");
        // Department deptObj5 = new Department(106, "BlockChain", "Patna");

        // String s = dao.insertDepartment(deptObj);
        // String s2 = dao.insertDepartment(deptObj2);
        // String s3 = dao.insertDepartment(deptObj3);
        // String s4 = dao.insertDepartment(deptObj4);
        // String s5 = dao.insertDepartment(deptObj5);
        // System.out.println(s + " INSERTED " + deptObj);
        // System.out.println(s2 + " INSERTED " + deptObj2);
        // System.out.println(s3 + " INSERTED " + deptObj3);
        // System.out.println(s4 + " INSERTED " + deptObj4);
        // System.out.println(s5 + " INSERTED " + deptObj5);

        // Department deptObj2up = new Department(103, "Mathematics", "Shivan");
        // String up = dao.updateDepartment(deptObj2up);
        // System.out.println(up + " UPDATED " + deptObj2up);

        // Save Or Update

        // Department deptObj6saveup = new Department(107, "Agricult", "Punjab");
        // String saveup = dao.insertORupdateDepartment(deptObj6saveup);
        // System.out.println(saveup + "SAVED OR UPDATED " + deptObj6saveup);

        // Delete

        // System.out.println("DELETED " + dao.deleteDepartment(107));

        // Fetch the records

        System.out.println(dao.getDepartment(102));
        // ! Error in loadDepartMent()
        System.out.println(dao.loadDepartment(101));

        System.out.println();
        System.out.println();

    }
}
