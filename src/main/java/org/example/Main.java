package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)) {
            hello(scan);
            nameCheck(scan);
            arrayCheck(scan);
        }
    }

    private static void hello(Scanner scan) {
        System.out.print("Введите число: ");
        double num = scan.nextInt();
        if (num > 7) {
            System.out.println("Привет");
        }
    }

    public static void nameCheck(Scanner scan) {
        System.out.print("Введите имя: ");
        String name = scan.next();
        if (name.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else System.out.println("Нет такого имени");
    }

    private static void arrayCheck(Scanner scan) {
        System.out.print("Введите длинну массива: ");
        int size = scan.nextInt();
        int[] arr = new int[size];
        System.out.print("Введите элементы массива: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.print("Элементы массива кратные 3: ");
        for (int j : arr)
            if (j % 3 == 0) {
                System.out.print(j + " ");
            }
    }
}
