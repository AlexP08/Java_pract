package org.example;

class Pyramid extends Shape{
    private double s;
    private double h;

    public Pyramid(double s,double h){
        this.s = s;
        this.h = h;
    }

    @Override
    public double get_volume() {
        return h * s * 4 / 3;
    }
}
