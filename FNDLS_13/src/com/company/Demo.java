package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>() {{
            add(15);

            add(25);

            add(35);
        }};
        int min = nums.stream().mapToInt(Integer::intValue).min().getAsInt();
        System.out.println(min);
        int min2 = nums.stream().min(Integer::compareTo).get();
        System.out.println(min2);

        int max = nums
                .stream()
                .mapToInt(n -> n.intValue())
                .max()
                .getAsInt();
        System.out.println(max);


        List<String> numbers = Arrays.asList("1","3","2", "5");
        List<Integer> collect = numbers
                .stream()
                .map(n -> Integer.parseInt(n))
                .map(n->n)
                .filter(e -> e >1)
                .collect(Collectors.toList());
        System.out.println(collect);




    }
}
