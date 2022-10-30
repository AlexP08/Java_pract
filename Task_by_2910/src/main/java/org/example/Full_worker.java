package org.example;

public class Full_worker extends Worker {

    public Full_worker(int id, String name, int num){
        super(id, name,num);
    }

    @Override
    public double calculate_salary() {
        return num;
    }
}
