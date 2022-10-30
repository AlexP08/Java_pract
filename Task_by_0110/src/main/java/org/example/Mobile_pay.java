package org.example;

public class Mobile_pay extends Payment{
//    Мобильное приложение
    private Card card;
    private final int mobile_id = 2;
    Mobile_pay(Card card){
        this.card = card;
    }


    @Override
    public void top_up_card() throws InterruptedException {
        Money_processing.process(card, mobile_id);

    }

    @Override
    public void check_card() throws InterruptedException {
        Money_processing.info(card,mobile_id);
    }

}