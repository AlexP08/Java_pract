package org.example;

public class Vector {
    private double x;
    private double y;
    private double z;


    public Vector(double x,double y,double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double lenght_vector(){
        return Math.sqrt(x*x+y*y+z*z);
    }

    public double get_x() {
        return x;
    }
    public double get_y() {
        return y;
    }
    public double get_z() {
        return z;
    }

    public static double scalar_vectors(Vector first_vector, Vector second_vector){
        return first_vector.get_x()*second_vector.get_x()+first_vector.get_y()*second_vector.get_y()+
                first_vector.get_z()*second_vector.get_z();
    }


    public static Vector standart_actions(Vector first_vector, Vector second_vector, int flag){
        switch(flag){
            case 1:
                String sum_1 = Double.toString(first_vector.get_x()+second_vector.get_x());
                String sum_2 = Double.toString(first_vector.get_y()+ second_vector.get_y());
                String sum_3 = Double.toString(first_vector.get_z()+ second_vector.get_z());
                System.out.println("f) Сумма векторов равна: (" + sum_1 + ", " + sum_2 + ", " + sum_3 + ")");
                return new Vector(first_vector.get_x()+second_vector.get_x(),
                        first_vector.get_y()+ second_vector.get_y(),
                        first_vector.get_z()+ second_vector.get_z());
            case 2:
                String sub_1 = Double.toString(first_vector.get_x()- second_vector.get_x());
                String sub_2 = Double.toString(first_vector.get_y()- second_vector.get_y());
                String sub_3 = Double.toString(first_vector.get_z()-  second_vector.get_z());
                System.out.println("f) Разность векторов равна: ("+sub_1 +", "+sub_2+", "+sub_3+")");
                return new Vector(first_vector.get_x()- second_vector.get_x(),
                        first_vector.get_y()- second_vector.get_y(),
                        first_vector.get_z()-  second_vector.get_z());
            case 3:
                String m_1 = Double.toString(first_vector.get_y()* second_vector.get_z()- first_vector.get_z()* second_vector.get_y());
                String m_2 = Double.toString(first_vector.get_z()* second_vector.get_x()- first_vector.get_x()* second_vector.get_z());
                String m_3 = Double.toString(first_vector.get_x()* second_vector.get_y()- first_vector.get_y()* second_vector.get_x());
                System.out.println("d) Векторное произведение векторов: ("+m_1+", "+m_2+", "+m_3+")");
                return new Vector(first_vector.get_y()* second_vector.get_z()- first_vector.get_z()* second_vector.get_y(),
                        first_vector.get_z()* second_vector.get_x()- first_vector.get_x()* second_vector.get_z(),
                        first_vector.get_x()* second_vector.get_y()- first_vector.get_y()* second_vector.get_x());
            default:
                return new Vector(0,0,0);
        }


    }
    public static Vector[] vectors(int n){
        Vector[] vectors = new Vector[n];
        for (int i = 0; i<n; i++){
            vectors[i] = new Vector(Math.random(),Math.random(),Math.random());
        }
        return vectors;
    }
    public static void print_vectors(Vector[] vectors){
        System.out.println("Созданны вот такой массив векторов:" );
        for (int i= 0; i< vectors.length; i++){
            System.out.println("x: "+vectors[i].get_x()+"; y: "+vectors[i].get_y()+"; z: "+vectors[i].get_z());
        }
    }
}
