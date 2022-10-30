package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Money_processing {

    public static void process(Card card,int info_type) throws InterruptedException {
        Info.info();

        if (card.get_type() == 1 || card.get_type() == 2 || card.get_type() == 3){
            if (card.get_info() ==0){
                int price = Info.get_price(card.get_type());
                Scanner scanner = new Scanner(System.in);
                try{
                    System.out.println("Стоимость пополнения:" + price +".Внесите сумму.");
                    int responce_1 = scanner.nextInt();
                    if(responce_1 == price){
                        card.increase();
                    }
                    else{
                        System.out.println("Карта не пополнена.");
                    }
                }
                catch (Exception ex){
                    System.out.println("Ошибка при работе.");
                }

            }
            else{
                System.out.println("Карта уже пополнена!");
            }

        }
        else if (card.get_type() == 4){

            Scanner scanner = new Scanner(System.in);
            System.out.println("Купить поездки (1) | пополнить баланс (2)");
            String responce_1 = scanner.next();
            if(info_type == 1){
                System.out.println("Подождите, операция выполняется...");
                TimeUnit.SECONDS.sleep(3);
            }
            if(responce_1.toLowerCase().equals("1")){
                int price = Info.get_price(card.get_type());
                Scanner scanner1 = new Scanner(System.in);
                try{
                    System.out.println("Стоимость пополнения:" + price +".Внесите сумму.");
                    int responce_2 = scanner1.nextInt();
                    if(info_type == 1){
                        System.out.println("Подождите, операция выполняется...");
                        TimeUnit.SECONDS.sleep(3);
                    }

                    if(responce_2 % price == 0){
                        card.increase(1,responce_2 / price);
                    }
                    else {
                        System.out.println("Карта не пополнена. Введите кратное число.");
                    }
                }
                catch (Exception ex){
                    System.out.println("Ошибка при работе.");
                }

            }
            else if(responce_1.toLowerCase().equals("2")){
                System.out.println("Внесите сумму.");
                Scanner scanner1 = new Scanner(System.in);
                int responce_2 = scanner1.nextInt();
                if(info_type == 1){
                    System.out.println("Подождите, операция выполняется...");
                    TimeUnit.SECONDS.sleep(3);
                }
                TimeUnit.SECONDS.sleep(3);
                card.increase(2,responce_2);
            }
        }
    }
    public static void info(Card card,int info_type) throws InterruptedException {
        if(info_type==1){
            System.out.println("Подождите, операция выполняется...");
            TimeUnit.SECONDS.sleep(3);
        }
        Map<Integer,String> dictionary = new HashMap<Integer,String>();
        dictionary.put(1,"Школьная");
        dictionary.put(2,"Студенческая");
        dictionary.put(3,"Социальная");
        dictionary.put(4,"Карта с поездками");
        System.out.println("-------------------------");
        System.out.println("Тип карты: "+dictionary.get(card.get_type()));
        card.get_info();
    }

}
