package org.example;

public class Hours_worker extends Worker{

    public Hours_worker(int id, String name, int per_hour){
        super(id, name,per_hour);
    }

    @Override
    public double calculate_salary() {
        return 20.8*8*this.num;
    }
}
