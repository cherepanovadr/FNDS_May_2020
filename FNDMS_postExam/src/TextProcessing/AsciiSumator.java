package TextProcessing;

import java.util.Scanner;

public class AsciiSumator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Write a program that prints a sum of all characters between two given characters (their ascii code).
        // On the first line you will get a character. On the second line you get another character.
        // On the last line you get a random string. Find all the characters between the two given and print their ascii sum.
        //.
        //@
        //dsg12gr5653feee5
        int sum = 0;
        String firstChar = scanner.nextLine();
        String secondChar = scanner.nextLine();
        String input = scanner.nextLine();
        char a = firstChar.charAt(0);
        char b = secondChar.charAt(0);


        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            if (current > a && current < b) {
                sum+=current;
            }

        }
        System.out.println(sum);


    }
}
