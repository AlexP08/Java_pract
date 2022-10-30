package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        final int school = 1;
        final int student = 2;
        final int social = 3;
        final int oneoff_card = 4;

        Fix_card user_1 = new Fix_card(school, true);
        Fix_card user_2 = new Fix_card(student, false);
        One_pay_card user_3 = new One_pay_card(oneoff_card, 1000, 1);
        One_pay_card user_4 = new One_pay_card(oneoff_card, 500, 0);
        One_pay_card user_5 = new One_pay_card(oneoff_card, 0, 0);

        Scanner scanner = new Scanner(System.in);
//        По логике человек физически приходит в банкомат или в заходит в телефон
       /*  Mobile_pay mobile_pay = new Mobile_pay(user_4);
        String ask2 = scanner.next();
        switch (ask2) {
            case "1": {
                mobile_pay.check_card();
                break;
            }
            case "2": {
                mobile_pay.top_up_card();
                break;
            }
            case "3":
                break;
        } */
        ATM atm = new ATM(user_3);
        System.out.println("1 - посмотреть баланс карты \n" + "2 - пополнить \n" + "3 - закончить работу");
        String ask2 = scanner.next();
        switch (ask2) {
            case "1": {
                atm.check_card();
                break;
            }
            case "2": {
                atm.top_up_card();
                break;
            }
            case "3":
                break;
        }


        Terminal terminal = new Terminal();
        terminal.check_card(user_1);
        terminal.check_card(user_2);
        terminal.check_card(user_3);
        terminal.check_card(user_4);
        terminal.check_card(user_5);
        terminal.print_info();
    }
}