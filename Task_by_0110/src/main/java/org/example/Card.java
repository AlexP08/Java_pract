package org.example;

public abstract class Card {

    public abstract int  check_status();
    public abstract int get_type();
    public abstract int get_info();
    public abstract void increase();
    public abstract void increase(int i, int i1);
    public abstract void decrease();
    public abstract void decrease(int i1);
}
