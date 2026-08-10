package in.co.corejava.oop.Encapsulation;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestEmployee {

    public static void main(String[] args) throws ParseException {

        Employee emp = new Employee();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        emp.setEmployeeId(101);
        emp.setEmployeeName("Nirmal");
        emp.setDesignation("Software Engineer");
        emp.setSalary(75000);
        emp.setJoiningDate(sdf.parse("2026-07-10"));
        
        System.out.println("Employee Id : " +emp.getEmployeeId());
        System.out.println("Employee Name  : " +emp.getEmployeeName());
        System.out.println("Employee Designation : " +emp.getDesignation());
        System.out.println("Employee Salary : " +emp.getSalary());
        System.out.println("Joining date  : " +emp.getJoiningDate());
    }
}