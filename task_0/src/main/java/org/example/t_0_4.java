package org.example;

public class t_0_4 {
    public static void main(String[] args){
    int a = 5;
    int b = 7;
    System.out.println("Было: a = "+a+" b = "+b);
    int n = a;
    a = b;
    b = n;
    System.out.println("Стало: a = "+a+" b = "+b);
    a = b ^ a;
    b = b ^ a;
    a = b ^ a;
    System.out.println("А теперь опять, a = "+a+" b = "+b);
    }
}
