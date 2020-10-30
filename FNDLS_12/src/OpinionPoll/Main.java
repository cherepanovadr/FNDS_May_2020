package OpinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> people = new ArrayList<>();

        int a = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < a; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);
            Person person = new Person(name, age);
            if (person.getAge() > 30) {
                people.add(person);
            }
        }
        people
                .stream()
                .sorted((p1, p2) -> p1.getName().compareTo(p2.getName()))
                .forEach(p -> System.out.println(p.getName() + " - " + p.getAge()));

    }
}
