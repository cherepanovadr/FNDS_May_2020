package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

//        A valid ticket should have exactly 20 characters. The winning symbols are '@', '#', '$' and '^'. But in order for a ticket to be a winner the symbol should uninterruptedly repeat for at least 6 times in both the tickets left half and the tickets right half.
//        For example, a valid winning ticket should be something like this:
//        "Cash$$$$$$Ca$$$$$$sh"
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split("[, ]+");
        String regex = "([$]{6,10}|[\\\\^]{6,10}|[#]{6,10}|[@]{6,10})";
        Pattern pattern = Pattern.compile(regex);
        for (String part : parts) {
            String FirstHalf = part.substring(0,10);
            String secondHalf = part.substring(10);
            Matcher matcherFirst = pattern.matcher(FirstHalf);
            Matcher matcherSec = pattern.matcher(secondHalf);
            String cur = "";
            if (part.length() != 20) {
                System.out.println("invalid ticket");
            } else {
                if (matcherFirst.find()&&matcherSec.find()) {
                    String fir = matcherFirst.group();
                    String sec = matcherSec.group();
                    if (fir.length()>sec.length())
                    {
                         cur = sec;
                   } else{
                         cur = fir;
                    }

                    if(FirstHalf.contains(cur)&&secondHalf.contains(cur)) {
                        if (cur.length() >= 6 && cur.length() <= 9) {
                            System.out.printf("ticket \"%s\" - %d%c%n", part, cur.length(), cur.charAt(0));
                        } else if (cur.length() == 10) {
                            System.out.printf("ticket \"%s\" - %d%c Jackpot!%n", part, cur.length(), cur.charAt(0));
                        } else{
                            System.out.printf("ticket \"%s\" - no match%n", part);
                        }
                    }else {
                        System.out.printf("ticket \"%s\" - no match%n", part);
                    }
                } else {
                    System.out.printf("ticket \"%s\" - no match%n", part);
                }

            }

        }
//A valid ticket should have exactly 20 characters.

    }
}
