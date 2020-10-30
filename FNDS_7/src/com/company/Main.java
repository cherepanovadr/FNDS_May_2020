package com.company;

public class Main {
    public static void printHello() {
        System.out.println("hey");
        //printHello();
    }

    public static void printBye() {
        System.out.println("bye");
    }

    public static void printName() {
        System.out.println("My name");
    }

    public static void main(String[] args) {
        printName();
        printHello();
        printBye();
        printSum (5,6);
    }

    public static void printSum(int first, int second){
        System.out.println(first + second);
    }

}
