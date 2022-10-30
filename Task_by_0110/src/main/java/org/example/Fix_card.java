package org.example;

public  class Fix_card extends Card {

    private int type;
    private boolean status;

    public Fix_card(int type, boolean status){
        this.type = type;
        this.status = status;
    }

    public void set_status(boolean status) {
        this.status = status;
    }



    public int get_type() {
        return type;
    }

    @Override
    public int get_info() {
        if (check_status() == 1){
            System.out.println("Информация: карта активна");
            return 1;
        }
        else{
            System.out.println("Информация: карта неактивна");
            return 0;
        }
    }

    @Override
    public void increase() {
        set_status(true);
    }

    @Override
    public void increase(int i, int i1) {

    }

    @Override
    public void decrease() {

    }

    @Override
    public void decrease(int i1) {

    }


    public void set_type(int type) {
        this.type = type;
    }

    @Override
    public int check_status() {
        if (status){
            return 1;
        }
        return 0;
    }
}