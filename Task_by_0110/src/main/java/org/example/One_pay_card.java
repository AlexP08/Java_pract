package org.example;

public class One_pay_card extends Card{
    private int balance;
    private int number_of_trips;
    private int type;

    public One_pay_card(int type, int balance, int number_of_trips){

        this.balance = balance;
        this.number_of_trips = number_of_trips;
        this.type = type;
    }

    public int get_balance() {
        return balance;
    }

    public int get_number_of_trips() {
        return number_of_trips;
    }

    public void set_balance(int balance) {
        this.balance = this.balance+balance;
    }

    public void set_number_of_trips(int number_of_trips) {
        this.number_of_trips = this.number_of_trips+number_of_trips;
    }

    @Override
    public int check_status() {
        if (this.number_of_trips >=1){
            decrease();
            return 10;
        }
        if (this.balance >= 35){
            decrease(35);
            return 11;
        }
        return 0;
    }

    @Override
    public int get_type() {
        return this.type;
    }

    @Override
    public int get_info() {

        System.out.println("Информация: "+ get_number_of_trips()+" поездок,  "+ get_balance()+" рублей.");
        if (get_number_of_trips()!=0){
            return get_number_of_trips();
        }
        return get_balance();
    }

    @Override
    public void increase() {

    }

    @Override
    public void increase(int type,int money) {
        if(type==1){
            set_number_of_trips(money);
        }
        if(type==2){
            set_balance(money);
        }
    }

    @Override
    public void decrease() {
        set_number_of_trips(-1);
    }

    @Override
    public void decrease(int money) {
        set_balance(-money);
    }
}
