package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите длинну массива: ");
        try {
            int size = scan.nextInt();
            int[] arr = new int[size];
            System.out.print("Введите массив чисел: ");
            for (int i = 0; i < arr.length; i++) arr[i] = scan.nextInt();
            System.out.print("Элементы массива кратные 3: ");
            for (int j : arr)
                if (j % 3 == 0) System.out.print(j + " ");
        } catch (InputMismatchException e){
            System.out.println("Ошибка! Неободимо вводить целые числа");
        }

    }
}
