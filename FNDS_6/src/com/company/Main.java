package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wagonsCount = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int[] train = new int[wagonsCount];
        for (int i = 0; i < wagonsCount; i++) {
            train[i] = Integer.parseInt(scanner.nextLine());
            sum+=train[i];
        }
        for (int i : train) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(sum);

    }
}
