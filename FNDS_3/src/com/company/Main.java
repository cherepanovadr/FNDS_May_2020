package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int a = Integer.parseInt(scanner.nextLine());
        System.out.printf("%.2f", a/1000.0);
    }
}
