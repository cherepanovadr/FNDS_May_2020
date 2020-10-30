package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Stream;

public class Ranking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, String> contestMap = new TreeMap<>();
        Map<String, Map<String, Integer>> candidates = new TreeMap<>();

        //contest pass
        while (!"end of contests".equals(input)) {
//"{contest}:{password for contest}"
            String[] parts = input.split(":");
            String contest = parts[0];
            String password = parts[1];
            contestMap.put(contest, password);
            input = scanner.nextLine();
        }
        String people = scanner.nextLine();

        while (!people.equals("end of submissions")) {
            String[] partsPeople = people.split("=>");
//C# Fundamentals=>fundPass=>Tanya=>350
            String contest2 = partsPeople[0];
            String pass2 = partsPeople[1];
            String name = partsPeople[2];
            int points = Integer.parseInt(partsPeople[3]);
            if (contestMap.containsKey(contest2) && contestMap.get(contest2).equals(pass2)) {
                candidates.putIfAbsent(name, new HashMap<>());
                candidates.get(name).putIfAbsent(contest2, 0);
                if (candidates.get(name).get(contest2) == 0) {
                    candidates.get(name).put(contest2, points);
                } else if (points > candidates.get(name).get(contest2)) {
                    candidates.get(name).put(contest2, points);
                }
            }

            people = scanner.nextLine();
        }
        int totalSum = 0;
        for (Map.Entry<String, Map<String, Integer>> entry : candidates.entrySet()) {
            int sum = entry.getValue().values().stream().mapToInt(i -> i).sum();
            if (sum > totalSum) {
                totalSum = sum;
            }
        }
        for (Map.Entry<String, Map<String, Integer>> mapEntry : candidates.entrySet()) {
            if (mapEntry.getValue().values().stream().mapToInt(i -> i).sum() == totalSum) {
                System.out.printf("Best candidate is %s with total %d points.%n", mapEntry.getKey(), totalSum);
            }
        }
        System.out.println("Ranking:");
        candidates.forEach((a, b) ->{
            System.out.printf("%s%n", a);
            b
                    .entrySet()
                    .stream()
                    .sorted((c, d) -> d.getValue() - c.getValue())
            .forEach(entry -> System.out.printf("#  %s -> %d%n", entry.getKey(), entry.getValue()));


        });

    }


}


