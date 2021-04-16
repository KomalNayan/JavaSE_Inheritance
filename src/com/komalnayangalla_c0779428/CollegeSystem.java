package com.komalnayangalla_c0779428;

import com.komalnayangalla_c0779428.employee.FullTimeEmployee;
import com.komalnayangalla_c0779428.employee.PartTimeFaculty;
import com.komalnayangalla_c0779428.student.FullTimeStudent;
import com.komalnayangalla_c0779428.student.PartTimeStudent;
import com.komalnayangalla_c0779428.vehicle.Car;
import com.komalnayangalla_c0779428.vehicle.MotorCycle;

import java.lang.constant.Constable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CollegeSystem {
    public static void main(String args[]) throws NoIDException
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Person> list = new ArrayList<Person>();
        FullTimeEmployee fte1 = new FullTimeEmployee(1,"Komal Nayan","Galla",Gender.MALE,25000.0f,"CSAT",130.0f,null);
        list.add(fte1);
        //fte1.display();
        FullTimeStudent fts1 = new FullTimeStudent(1,"Portgas D.","Ace",Gender.MALE,"CSAT",new Car(1122,true,"Puma",Color.BLACK),"Lambton College",98.54f);
        //fts1.display();
        list.add(fts1);
        PartTimeStudent pts1 = new PartTimeStudent(2,"Monkey D.","Luffy",Gender.MALE,"CCPT",new MotorCycle(1234,true,"DUCATI",2),"Cestar College",30);
        //pts1.display();
        list.add(pts1);
        System.out.println("-------- READING PART TIME EMPLOYEE DETAILS ----------");
        PartTimeFaculty partTimeFaculty = null;
        try {
            System.out.print("Enter ID : ");
            int ptfID = sc.nextInt();
            sc.nextLine(); //to goto next line
            System.out.print("Enter First Name : ");
            String ptfFName = sc.nextLine();
            System.out.print("Enter Last Name : ");
            String ptfLName = sc.nextLine();
            System.out.print("Enter Total Salary : ");
            float ptfSalary = sc.nextFloat();
            System.out.print("Enter no. of working hours : ");
            int ptfWorkingHours = sc.nextInt();
            System.out.print("Enter Pay per Hour : ");
            float ptfPayPerHour = sc.nextFloat();
            if (ptfID == 0) {
                throw new NoIDException("ID cannot be zero!");
            }
            partTimeFaculty = new PartTimeFaculty(ptfID,ptfFName,ptfLName,Gender.MALE,ptfSalary,"CSAT",ptfWorkingHours,ptfPayPerHour,new MotorCycle(1121,true,"Lund",2));
            list.add(partTimeFaculty);
        }
        catch (NoIDException nide)
        {
            System.out.println(nide.getMessage());
        }
        catch (InputMismatchException ime)
        {
            System.out.println("Entered Input Type Mismatched!\nPlease Enter the correct type");
        }
        finally {

            for(Person p : list)
            {
                System.out.println("Type : "+p.getClass());
                p.display();
            }

        }

    }
}
