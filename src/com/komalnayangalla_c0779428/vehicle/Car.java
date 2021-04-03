package com.komalnayangalla_c0779428.vehicle;

import com.komalnayangalla_c0779428.Color;

public class Car extends Vehicle{
    Color color;

    public Car(int vin, boolean isInsured, String brand, Color color) {
        super(vin, isInsured, brand);
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color=" + color +
                ", vin=" + vin +
                ", isInsured=" + isInsured +
                ", brand='" + brand + '\'' +
                '}';
    }
}
