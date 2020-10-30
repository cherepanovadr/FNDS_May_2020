package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int digit = Integer.parseInt(scanner.nextLine());

        System.out.println(Integer.BYTES);
        String binaryString = Integer.toBinaryString(number);
        System.out.println(binaryString);
    }
}
