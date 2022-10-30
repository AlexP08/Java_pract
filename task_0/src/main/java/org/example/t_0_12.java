package org.example;

public class t_0_12 {
    public static void main(String[] args){
        System.out.println(Distance(4, 5, 2, 3));

    }
    public static float Distance(float x1, float x2, float y1, float y2){
        return (float) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
