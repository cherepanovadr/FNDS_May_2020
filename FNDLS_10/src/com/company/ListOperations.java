package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = readInlist(scanner);
        String input = scanner.nextLine();

        while (!"End".equals(input)) {
            String[] tokens = input.split("\\s+");
            String command = tokens[0];
            switch (command) {
                case "Add":
                    int a = Integer.parseInt(tokens[1]);
                    numbers.add(a);
                    break;
                case "Insert":
                    a = Integer.parseInt(tokens[1]);
                    int index = Integer.parseInt(tokens[2]);
                    if (isValid(numbers, index)) {
                        numbers.add(index, a);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Remove":
                    index = Integer.parseInt(tokens[1]);
                    if (isValid(numbers, index)) {
                        numbers.remove(index);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Shift":
                    int count = Integer.parseInt(tokens[2]);
                    if ("left".equals(tokens[1])) {
                        for (int i = 0; i < count; i++) {
                            int temp = numbers.remove(0);
                            numbers.add(temp);

                        }
                    } else if ("right".equals(tokens[1])) {
                        for (int i = 0; i < count; i++) {

                        int temp = numbers.remove(numbers.size() - 1);
                        numbers.add(0, temp);
                        }
                    }
                    break;
            }
        input = scanner.nextLine();
        }
        printList(numbers);
    }

    private static boolean isValid(List<Integer> numbers, int index) {
        boolean result = index >= 0 && index < numbers.size();
        return result;
    }

    private static void printList(List<Integer> list) {
        for (Integer integer : list) {
            System.out.print(integer + " ");

        }
    }

    private static List<Integer> readInlist(Scanner scanner) {
        List<Integer> output = new ArrayList<>();
        String[] input = scanner.nextLine().split("\\s+");
        for (String s : input) {
            output.add(Integer.parseInt(s));
        }
        return output;
    }
}

