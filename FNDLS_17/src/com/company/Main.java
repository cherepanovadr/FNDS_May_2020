package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String regex = "([^A-Za-z0-9 ]+)([a-z]+|\\d+)\\1";
        String text = "_abc _123_ -== ___ _a1_ ...123... !!abc!! ";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        String replaced = matcher.replaceAll("???");
        System.out.println(replaced);
        while (matcher.find()) {
            System.out.println(matcher.group());
            System.out.println("---1:" + matcher.group(1));
            System.out.println("---2:" + matcher.group(2));
        }

    }
}
