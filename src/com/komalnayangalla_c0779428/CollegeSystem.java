package com.komalnayangalla_c0779428;

import com.komalnayangalla_c0779428.employee.FullTimeEmployee;
import com.komalnayangalla_c0779428.student.FullTimeStudent;
import com.komalnayangalla_c0779428.student.PartTimeStudent;
import com.komalnayangalla_c0779428.vehicle.Car;
import com.komalnayangalla_c0779428.vehicle.MotorCycle;

import java.util.ArrayList;

public class CollegeSystem {
    public static void main(String args[])
    {
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
        for(Person p : list)
        {
            System.out.println("Type : "+p.getClass());
            p.display();
        }

    }
}
