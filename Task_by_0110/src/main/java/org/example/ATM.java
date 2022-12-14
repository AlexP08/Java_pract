package org.example;

public class ATM extends Payment{

        private Card card;
        private final int atm_id = 1;
        ATM(Card card){
            this.card = card;
        }

        @Override
        public void top_up_card() throws InterruptedException {
            Money_processing.process(card,atm_id);
        }

        @Override
        public void check_card() throws InterruptedException {
            Money_processing.info(card,atm_id);

        }

    }

