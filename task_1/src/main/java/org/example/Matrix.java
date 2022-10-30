package org.example;

import java.util.Arrays;

public class Matrix {
    private double[][] matrix;
    private int n;
    private int m;

    public Matrix(double[][] matrix) {
        this.matrix = matrix;
        this.n = matrix.length;
        this.m = matrix[0].length;
    }

    public void show_matrix() {

        for (int i = 0; i < n; i++) {


            for (int j = 0; j < m; j++) {

            }
            System.out.println(Arrays.toString(matrix[i]));
        }

    }

    public int get_m() {
        return m;
    }

    public int get_n() {
        return n;
    }

    public double get_el(int n, int m) {
        return matrix[n][m];
    }


    public static Matrix add_sub(Matrix matrix1, Matrix matrix2, boolean flag) {
        if (matrix1.get_m() == matrix2.get_m() && matrix1.get_n() == matrix2.get_n()) {
            double[][] r_matrix = new double[matrix1.get_n()][matrix1.get_m()];
            for (int i = 0; i < matrix1.get_n(); i++) {
                for (int j = 0; j < matrix1.get_m(); j++) {
                    if (flag) {
                        r_matrix[i][j] = matrix1.get_el(i, j) + matrix2.get_el(i, j);
                    } else {
                        r_matrix[i][j] = matrix1.get_el(i, j) - matrix2.get_el(i, j);
                    }

                }
            }
            return new Matrix(r_matrix);


        } else {
            System.out.println("Такие действия нельзя произвести с этими матрицами!");
            return null;
        }
    }
    public Matrix trans_matrix() {
        System.out.println("d) Транспонированная матрица:");
        double[][] t_matrix = new double[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                t_matrix[i][j] = matrix[j][i];
            }

        }
        return new Matrix(t_matrix);
    }



    public static Matrix mult_matrix(Matrix matrix1, Matrix matrix2) {

        if (matrix1.get_m() == matrix2.get_n() && matrix1.get_n() == matrix2.get_m()) {
            double[][] m_matrix = new double[matrix1.get_n()][matrix2.get_m()];
            for (int i = 0; i < matrix1.get_n(); i++) {
                for (int j = 0; j < matrix2.get_m(); j++) {
                    for (int r = 0; r < matrix2.get_n(); r++) {
                        m_matrix[i][j] += matrix1.get_el(i, r) * matrix2.get_el(r, j);
                    }
                }
            }
            return new Matrix(m_matrix);
        } else {
            System.out.println("Такие действия нельзя произвести с этими матрицами!");
            return null;
        }
    }



    public static Matrix mult_num_matrix(Matrix matrix1, double num) {
        double[][] matrix = new double[matrix1.get_n()][matrix1.get_m()];
        for (int i = 0; i < matrix1.get_n(); i++) {
            for (int j = 0; j < matrix1.get_m(); j++) {
                matrix[i][j] = matrix1.get_el(i, j) * num;
            }

        }
        System.out.println("b) Умножено на число "+num+"!");
        return new Matrix(matrix);
    }

}
