package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int a = Integer.parseInt(scanner.nextLine());
int b = Integer.parseInt(scanner.nextLine());
int c = Integer.parseInt(scanner.nextLine());
printMin(a,b,c);

    }

    private static void printMin(int a, int b, int c) {
        int d = Math.min(a,b);
        System.out.println(Math.min(c,d));



    }
}
