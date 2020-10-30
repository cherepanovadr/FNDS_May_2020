package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] numbers = new int[10];
        numbers[0] = 14;
        numbers[1] = Integer.parseInt("59");
        System.out.println(numbers[1]);
        System.out.println(numbers[5]);
        System.out.println(numbers[0]);
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());

        String[] names = new String[a];
        for (int i = 0; i < a; i++) {
            names[i]=scanner.nextLine();
        }
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }

}
