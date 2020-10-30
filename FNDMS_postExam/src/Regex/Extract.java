package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Extract {
    public static void main(String[] args) {
        String regName = "@(?<name>[A-Za-z]+)\\|";
        String regAge = "#(?<age>\\d+)\\*";
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Pattern patternName = Pattern.compile(regName);
        Pattern patternAge = Pattern.compile(regAge);
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();

            Matcher matcherName = patternName.matcher(input);
            Matcher matcherAge = patternAge.matcher(input);
            if (matcherAge.find() && matcherName.find()) {
                String name = matcherName.group("name");
                int age = Integer.parseInt(matcherAge.group("age"));

                System.out.printf("%s is %d years old.%n", name, age);
            }


        }


    }


}
