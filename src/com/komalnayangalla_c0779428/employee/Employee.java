package com.komalnayangalla_c0779428.employee;

import com.komalnayangalla_c0779428.Gender;
import com.komalnayangalla_c0779428.IDisplay;
import com.komalnayangalla_c0779428.NoIDException;
import com.komalnayangalla_c0779428.Person;

public class Employee extends Person implements IDisplay {
    float totalSalary;

    public Employee(int id, String firstName, String lastName, Gender gender, float totalSalary) {
        super(id, firstName, lastName, gender);
        this.totalSalary = totalSalary;
    }

    public Employee(float totalSalary) {
        this.totalSalary = totalSalary;
    }

    public Employee(int id, String firstName, String lastName, Gender gender) {
        super(id, firstName, lastName, gender);
    }

    public Employee() {
    }



    public void display()
    {

        System.out.println("Employee ID : "+id);
        System.out.println("Employee Name : "+firstName+" "+lastName);
        System.out.println("Employee Gender : "+gender);
        System.out.println("Employee Total Salary : "+totalSalary);
        System.out.println("--------------------------------------------");
    }
}
