package org.example;

import java.io.*;
import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        boolean mode = true; // чтобы чтение установить true, чтобы записать - false

        ArrayList<Worker> list = new ArrayList<>();

        if(mode){
            //чтение файла
            list = Main.read_file("workers_list.txt");
        }
        else{
            //задаем свои данные
            list.add(new Hours_worker(1, "Snegirev", 520));
            list.add(new Hours_worker(6, "Onegin", 820));
            list.add(new Full_worker(2, "Shatov", 90000));
            list.add(new Full_worker(3, "Kirilov", 120000));
            list.add(new Full_worker(4, "Kohenen", 150000));
            list.add(new Full_worker(5, "Lang", 1050000));
        }

        if(list.size() != 0){
            list.sort(Comparator.comparing(Worker::calculate_salary, Collections.reverseOrder()).thenComparing(Worker::get_name));
            for (int i = 0; i < 5; i++) {
                System.out.println(list.get(i).get_name());
            }
            for (int i = list.size() - 1; i > list.size() - 4; i--) {
                System.out.println(list.get(i).get_id());
            }
            //общая статистика и запись в файл
            Main.print_list(list);
            Main.write_file(list);
        }
        else{
            System.out.println("Файл не прочтен!");
        }


    }

    public static void print_list(ArrayList<Worker> list) {
        //вывод списка на экран
        for (Worker i : list) {
            System.out.println(i.get_id() + " " + i.get_name() + " " + (int)i.get_num()+" "+ i.calculate_salary());
        }
    }

    public static void write_file(ArrayList<Worker> list) throws IOException {
        //запись в файл
        FileWriter writer = new FileWriter("workers_list.txt");
        for (Worker i : list) {
            writer.write(i.get_id() + " " + i.get_name() + " " + (int)i.get_num() + "\n");
        }
        writer.flush();
    }

    public static ArrayList<Worker> read_file(String path){
        //чтение файла
        ArrayList<Worker> list = new ArrayList<>();
        HashSet<Integer> id_list = new HashSet<>();
        try {
            FileReader fr = new FileReader(path);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                int id = Integer.parseInt(line.split(" ")[0]);
                if(id_list.contains(id)){
                    id+=1;
                }

                String name = line.split(" ")[1];

                if(name.length() == 0){
                    throw new Exception();
                }
                int status = Integer.parseInt(line.split(" ")[2]);
                if(status<5000){
                    System.out.println("Part-time worker!");
                    list.add(new Hours_worker(id,name,status));
                }
                else{
                    System.out.println("Full worker!");
                    list.add(new Full_worker(id,name,status));
                }
                line = reader.readLine();
            }
            return list;

        }
        catch (IOException ex){
            System.out.print("Ошибка чтения.");
            return list;
        }
        catch (Exception ex){
            System.out.print("Ошибка общего назначения. Проверьте свои данные.");
            return list;
        }
    }

}