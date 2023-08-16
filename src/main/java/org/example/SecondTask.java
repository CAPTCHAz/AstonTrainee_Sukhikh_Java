package org.example;

import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = scan.next();
        if(name.equals("Вячеслав")){
            System.out.println("Привет, Вячеслав");
        }else System.out.println("Нет такого имени");
    }
}