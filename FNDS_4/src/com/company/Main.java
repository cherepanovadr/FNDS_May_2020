package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
int a = Integer.parseInt(scanner.nextLine());
int b = Integer.parseInt(scanner.nextLine());
int c = Integer.parseInt(scanner.nextLine());
int d = Integer.parseInt(scanner.nextLine());
int total = (a+b)/c * d;
        System.out.println(total);
    }
}
