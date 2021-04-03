package com.komalnayangalla_c0779428.student;

import com.komalnayangalla_c0779428.Gender;
import com.komalnayangalla_c0779428.vehicle.Vehicle;

public class PartTimeStudent extends Student{
    int noWeeklyHours;

    public PartTimeStudent(int id, String firstName, String lastName, Gender gender, String courseName, Vehicle vehicle, String collegeName, int noWeeklyHours) {
        super(id, firstName, lastName, gender, courseName, vehicle, collegeName);
        this.noWeeklyHours = noWeeklyHours;
    }

    public void display()
    {
        System.out.println("Parttime Student ID : "+id);
        System.out.println("Parttime Student Name : "+firstName+" "+lastName);
        System.out.println("Parttime Student Gender : "+gender);
        System.out.println("Parttime Student Course : "+courseName);
        System.out.println("Parttime Student College : "+collegeName);
        System.out.println("Parttime Student no. of Weekly Hours : "+noWeeklyHours);
        System.out.println("Parttime Student Vehicle : "+vehicle);
        System.out.println("--------------------------------------------");
    }
}
