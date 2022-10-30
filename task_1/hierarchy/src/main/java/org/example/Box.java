package org.example;

import java.util.ArrayList;

public class Box extends Shape{
    private double state;
    private ArrayList<Shape> box = new ArrayList<Shape>();

    public Box(double state){
        super(state);
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
}
