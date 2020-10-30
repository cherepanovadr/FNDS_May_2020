package OrderByAge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> people = new ArrayList<>();
        String input = scanner.nextLine();
        while (!input.equalsIgnoreCase("end")) {

            String[] text = input.split(" ");
            String name = text[0];
            String id = text[1];
            int age = Integer.parseInt(text[2]);
            input = scanner.nextLine();
            Person person = new Person(name, id, age);
            people.add(person);
        }
        if (input.equalsIgnoreCase("end")) {
            people
                    .stream()
                    .sorted((p1,p2) -> Integer.compare(p1.getAge(),p2.getAge()))
                    .forEach(p -> System.out.println(p));

        }
    }
}
