package org.example;

public class t_0_11 {
    public static void main(String[] args){
        System.out.println(AvgG(2, 8));
        System.out.println(AvgG(3, 12));
        System.out.println(AvgG(56, 88));

    }
    public static float AvgG(int f, int s){
        return (float) Math.sqrt (f * s);
    }
}
