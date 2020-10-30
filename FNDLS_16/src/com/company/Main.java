package com.company;

import java.util.Scanner;

public class Main {
    //•	Has length between 3 and 16 characters
//•	Contains only letters, numbers, hyphens and underscores
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = scanner.nextLine().split(", ");
        for (String name : names) {
            if (isValidName(name)) {
                System.out.println(name);
            }
        }
    }
    private static boolean isValidName(String name) {
        if (name.length() < 3 || name.length() > 16) {
            return false;
        }
        for (int i = 0; i < name.length(); i++) {
            char curr = name.charAt(i);
            if (!Character.isLetterOrDigit(curr) && curr != '-' && curr != '_') {
                return false;
            }
       }
        return true;
    }
}
