package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        double x1 = 14;
        double y1 = 4;
        double z1 = 5;
        double x2 = 5.2;
        double y2 = 3;
        double z2 = 1;

        Scanner scanner = new Scanner(System.in);

        Vector first_vector = new Vector(x1,y1,z1);
        double lenght_v1 = first_vector.lenght_vector();
        System.out.println("b) Длина вектора равна: "+ lenght_v1);

        Vector second_vector = new Vector(x2,y2,z2);
        double scalar = Vector.scalar_vectors(first_vector,second_vector);
        double lenght_v2= second_vector.lenght_vector();
        System.out.println("c) Скалярное произведение двух векторов равно: "+ scalar);

        Vector.standart_actions(first_vector,second_vector,3);

        String cosinus = Double.toString(scalar/(lenght_v1*lenght_v2));
        System.out.println("e) Косинус угла равен: "+cosinus);

        Vector.standart_actions(first_vector,second_vector,1);
        Vector.standart_actions(first_vector,second_vector,2);

        System.out.println("g) Введите размер вашего массива:");
        int n = scanner.nextInt();
        Vector[] vectors  = Vector.vectors(n);
        Vector.print_vectors(vectors);



    }
}