package org.example;

public class Main {
    public static void main(String[] args){
        int[] values = { 1, 2, 3, 5, 8};
        int[] weights = { 1, 2, 3, 10 };
        RandArrElem randarr = new RandArrElem(values,weights);
        randarr.get_rand();
    }
}