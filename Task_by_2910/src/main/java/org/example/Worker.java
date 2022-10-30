package org.example;

abstract class Worker {
    private int id;
    private String name;
    double num;

    public Worker(int id, String name, double num){
        this.id =id;
        this.name = name;
        this.num = num;
    }

    public int get_id() {
        return id;
    }
    public String get_name() {
        return name;
    }
    public double get_num(){
        return num;
    }
    public abstract  double calculate_salary();
}
