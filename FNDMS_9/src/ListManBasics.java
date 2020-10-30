import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListManBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] parts = scanner.nextLine().split(" ");
        List<Integer> numbers = new ArrayList<>();
        for (String part : parts) {
            int current = Integer.parseInt(part);
            numbers.add(current);
        }
        String command = scanner.nextLine();
        while (!command.equalsIgnoreCase("end")) {
            String[] commandParts = command.split(" ");
            String commandName = commandParts[0];
            int argument = Integer.parseInt(commandParts[1]);

            switch (commandName) {
                case "Add":
                    numbers.add(argument);
                    break;
                case "Remove":
                    numbers.remove(Integer.valueOf(argument));
                    break;
                case "RemoveAt":
                    numbers.remove(argument);
                    break;
                case "Insert":
                    int index = Integer.parseInt(commandParts[2]);
                    numbers.add(index,argument);
                    break;
            }
            command = scanner.nextLine();
        }
        if (command.equalsIgnoreCase("end")) {
            System.out.println(numbers.toString());
            }

        }

    }

