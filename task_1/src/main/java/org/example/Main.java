package org.example;

public class Main {
    public static void main(String[] args)  {
        double[][] A =  {{5,1,1},
                {4,1,6},
                {2,4,7},
                {2,1,5},
                {2,2,1},
        };

        double[][] B = {{7,1,2,2,6},
                {3,5,7,1,4},
                {5,6,2,6,3}};

        double[][] C =  {{3,4,2},
                {3,9,10},
                {2,4,7}};
        double[][] D =  {{3,4,2},
                {3,9,10},
                {2,4,7}};
        Matrix matrix1 = new Matrix(A);
        Matrix matrix2 = new Matrix(B);
        Matrix matrix3 = new Matrix(C);
        Matrix matrix4 = new Matrix(D);

        matrix1.trans_matrix();
        matrix1.show_matrix();

        matrix4.trans_matrix();
        matrix4.show_matrix();

        int degree = 4;
        Matrix d = new Matrix(C);
        for(int i =0; i<degree-1; i++){
            if (i==0){
                d = Matrix.mult_matrix(matrix3,matrix3);
            }
            if (i>0){
                d = Matrix.mult_matrix(d,matrix3);
            }

        }

        if (d!=null){
            System.out.println("e) Возведено в " + degree + " степень!");
            d.show_matrix();
        }
        d = Matrix.mult_num_matrix(matrix1,3);
        d.show_matrix();

        Matrix a = Matrix.mult_matrix(matrix1,matrix2);
        Matrix b = Matrix.add_sub(matrix1,matrix2,true);
        if (a!=null){
            System.out.println("c) Матрицы перемножены!");
            a.show_matrix();
        }

        Matrix f = Matrix.add_sub(matrix3,matrix4,true);
        Matrix e = Matrix.add_sub(matrix3,matrix4,false);
        if (f!=null){
            System.out.println("a) Матрицы сложены или вычтены!");
            f.show_matrix();
            e.show_matrix();
        }




    }
}