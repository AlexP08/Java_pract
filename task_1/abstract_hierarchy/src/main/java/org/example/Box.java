package org.example;

import java.util.ArrayList;

public class Box {
    private double state;
    private ArrayList<Shape> box = new ArrayList<Shape>();
    private double volume;

    public Box(double state){
        this.volume = volume;
        this.state = state;
    }
    public boolean add(Shape shape){
        if (state >= shape.get_volume()){
            box.add(shape);
            state -= shape.get_volume();
            System.out.println("Состояние склада - "+ state);
            return true;
        }
        else{
            return false;
        }
    }
    public double get_volume() {
        System.out.println("Значение объекта - "+ volume);
        return volume;
    }
}
