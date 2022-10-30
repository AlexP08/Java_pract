package org.example;

public class t_0_9 {
    public static void main(String[] args){
        System.out.println(gap(34));
        System.out.println(gap(-3));
        System.out.println(gap(12));
        System.out.println(gap(21));
        System.out.println(gap(101));
    }
    public static int gap(int num) {
        return Math.abs(num - 21);
    }
}
