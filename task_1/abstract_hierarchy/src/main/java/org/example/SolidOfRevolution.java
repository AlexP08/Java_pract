package org.example;

abstract class SolidOfRevolution extends Shape{
    protected double radius;

    public SolidOfRevolution(double radius){
        this.radius = radius;
    }
    public double get_radius() {
        return radius;
    }
}
