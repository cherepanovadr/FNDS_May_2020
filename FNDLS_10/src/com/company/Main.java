package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> train = readInlist(scanner);
        int capacity = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        while (!"end".equals(input)) {
            String[] tokens = input.split(" ");
            if ("Add".equals(tokens[0])) {
                int people = Integer.parseInt(tokens[1]);
                train.add(people);
            } else {
                int peopleToAdd = Integer.parseInt(tokens[0]);
                for (int wagon = 0; wagon < train.size(); wagon++) {
                    int sum = train.get(wagon) + peopleToAdd;
                    if (sum <= capacity) {
                        train.set(wagon, sum);
                        break;
                    }

                }
            }


            input = scanner.nextLine();
        }
      if ("end".equals(input)) {
          printTrain(train);
                }


    }

    private static void printTrain(List<Integer> train) {
        for (Integer integer : train) {
            System.out.print(integer + " ");

        }
    }

    private static List<Integer> readInlist(Scanner scanner) {
      List<Integer> train = new ArrayList<>();
      String[] input = scanner.nextLine().split(" ");
        for (String s : input) {
            train.add(Integer.parseInt(s));
        }
       return train;
    }
}
