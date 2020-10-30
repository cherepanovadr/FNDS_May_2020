package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        String regex = ">>(\\w+)<<(\\d+[.]?\\d*)!(\\d)\\b";
        List<String> cities = new ArrayList<>();
        double total = 0;
        Pattern pattern = Pattern.compile(regex);


        while (!text.equalsIgnoreCase("purchase")) {
            double sum = 0;
            Matcher matcher = pattern.matcher(text);
            while (matcher.find()) {
                cities.add(matcher.group(1));
                double price = Double.parseDouble(matcher.group(2));
                double quantity = Integer.parseInt(matcher.group(3));
                sum = price * quantity;
                total += sum;
                sum = 0;

                //1 - city
                // 2= price
                //3 - quantity
            }
            text = scanner.nextLine();
        }
        System.out.println(String.format("Bought furniture:"));
        System.out.println(String.join("\n", cities));
        System.out.println(String.format("Total money spend: %.2f", total));

    }
}

