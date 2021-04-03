package com.komalnayangalla_c0779428.employee;

import com.komalnayangalla_c0779428.Gender;
import com.komalnayangalla_c0779428.IDisplay;

public class Faculty extends Employee implements IDisplay {
    String department;

    public Faculty(int id, String firstName, String lastName, Gender gender, float totalSalary, String department) {
        super(id, firstName, lastName, gender, totalSalary);
        this.department = department;
    }

    public Faculty(float totalSalary, String department) {
        super(totalSalary);
        this.department = department;
    }

    public Faculty(int id, String firstName, String lastName, Gender gender, String department) {
        super(id, firstName, lastName, gender);
        this.department = department;
    }

    public Faculty(String department) {
        this.department = department;
    }

    public Faculty()
    {

    }
    public void display()
    {
        System.out.println("Faculty ID : "+id);
        System.out.println("Faculty Name : "+firstName+" "+lastName);
        System.out.println("Faculty Gender : "+gender);
        System.out.println("Faculty Total Salary : "+totalSalary);
        System.out.println("Faculty Department : "+department);
        System.out.println("--------------------------------------------");
    }
}
