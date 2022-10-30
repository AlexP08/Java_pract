package org.example;

public class SolidOfRevolution extends Shape {
    private double radius;

    public SolidOfRevolution(double radius,double volume){
        super(volume);
        System.out.println("Значение объекта - "+ volume);
        this.radius = radius;
    }

    public double get_radius() {
        return radius;
    }
}
