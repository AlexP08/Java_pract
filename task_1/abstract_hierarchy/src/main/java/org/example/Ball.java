package org.example;

class Ball extends SolidOfRevolution {
    public double get_volume(){
        return Math.PI * Math.pow(radius, 3) * 4 / 3;
    }
    public Ball(double radius){
        super(radius);
    }

}
