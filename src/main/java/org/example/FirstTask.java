package org.example;

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = scan.nextInt();
        if(num>7){
            System.out.println("Привет");
        }
    }
}