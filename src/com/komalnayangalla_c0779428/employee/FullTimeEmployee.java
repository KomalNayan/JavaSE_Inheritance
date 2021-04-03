package com.komalnayangalla_c0779428.employee;

import com.komalnayangalla_c0779428.Gender;
import com.komalnayangalla_c0779428.IDisplay;
import com.komalnayangalla_c0779428.vehicle.Vehicle;

public class FullTimeEmployee extends Faculty implements IDisplay {
    float bonus;
    Vehicle vehicle;

    public FullTimeEmployee(int id, String firstName, String lastName, Gender gender, float totalSalary, String department, float bonus, Vehicle vehicle) {
        super(id, firstName, lastName, gender, totalSalary, department);
        this.bonus = bonus;
        this.vehicle = vehicle;
    }

    public void display()
    {
        System.out.println("Fulltime Employee ID : "+id);
        System.out.println("Fulltime Employee Name : "+firstName+" "+lastName);
        System.out.println("Fulltime Employee Gender : "+gender);
        System.out.println("Fulltime Employee Total Salary : "+totalSalary);
        System.out.println("Fulltime Employee Bonus : "+bonus);
        System.out.println("Fulltime Employee Vehicle : "+vehicle);
        System.out.println("--------------------------------------------");
    }
}
