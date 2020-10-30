import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListManAdvanced {
    public static void main(String[] args) {
        // Create list of integers
        Scanner scanner = new Scanner(System.in);
        String[] parts = scanner.nextLine().split(" ");
        List<Integer> numbers = new ArrayList<>();
        for (String part : parts) {
            int current = Integer.parseInt(part);
            numbers.add(current);
        }
        //create loop
        String command = scanner.nextLine();
        while (!command.equalsIgnoreCase("end")) {
            String[] commandParts = command.split(" ");
            String action = commandParts[0];
            switch (action) {
                case "Contains":
                    int argument = Integer.parseInt(commandParts[1]);
                    if (numbers.contains(argument) == true) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    String type = commandParts[1];
                    if (type.equalsIgnoreCase("even")) {
                        for (int number : numbers) {
                            if (number % 2 == 0) {
                                System.out.print(number + " ");
                            }

                        }
                        System.out.println();
                    } else if (type.equalsIgnoreCase("odd")) {
                        for (int number : numbers) {
                            if (number % 2 == 1) {
                                System.out.print(number + " ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "Get":
                    String typeA = commandParts[1];
                    int summa = 0;
                    if (typeA.equalsIgnoreCase("sum")) {
                        for (int number : numbers) {
                            summa = summa + number;
                        }
                        System.out.println(summa);
                    }
                    break;
                case "Filter":
                    String condition = commandParts[1];
                    int number = Integer.parseInt(commandParts[2]);
                    if (condition.equalsIgnoreCase("<")) {
                        for (int numberr : numbers) {
                            if ( numberr < number)
                            System.out.printf("%d ", numberr);
                        }
                        System.out.println();
                    } else if (condition.equalsIgnoreCase(">")) {
                        for (int numberr : numbers) {
                            if (numberr > number)
                            System.out.printf("%d ", numberr);
                        }
                        System.out.println();
                    } else if (condition.equalsIgnoreCase(">=")) {
                        for (int numberr : numbers) {
                            if (numberr >= number){
                            System.out.printf("%d ",numberr );
                        }}
                        System.out.println();
                    } else if (condition.equalsIgnoreCase("<=")) {
                        for (int numberr : numbers) {
                            if (numberr <= number)
                            System.out.printf("%d ", numberr);
                        }
                    }
                    break;
            }
            command = scanner.nextLine();
        }

    }


}

