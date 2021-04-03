package com.komalnayangalla_c0779428.student;

import com.komalnayangalla_c0779428.Gender;
import com.komalnayangalla_c0779428.IDisplay;
import com.komalnayangalla_c0779428.Person;
import com.komalnayangalla_c0779428.vehicle.Vehicle;

public class Student extends Person implements IDisplay {
    String courseName;
    Vehicle vehicle;
    String collegeName;

    public Student(int id, String firstName, String lastName, Gender gender, String courseName, Vehicle vehicle, String collegeName) {
        super(id, firstName, lastName, gender);
        this.courseName = courseName;
        this.vehicle = vehicle;
        this.collegeName = collegeName;
    }

    public Student() {
    }

    public void display()
    {
        System.out.println("Student ID : "+id);
        System.out.println("Student Name : "+firstName+" "+lastName);
        System.out.println("Student Gender : "+gender);
        System.out.println("Student Course : "+courseName);
        System.out.println("Student College : "+collegeName);
        System.out.println("Student Vehicle : "+vehicle);
        System.out.println("--------------------------------------------");
    }
}
