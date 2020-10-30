import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exam2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] parts = scanner.nextLine().split("\\s+");
        List<Integer> numbers = new ArrayList<>();
        for (String part : parts) {
            int current = Integer.parseInt(part);
            numbers.add(current);
        }
        String command = scanner.nextLine();
        while (!"End".equalsIgnoreCase(command)) {
            String[] input = command.split("\\s+");
            String action = input[0];
            switch (action) {
                case "swap":
                    int a = Integer.parseInt(input[1]);
                    int b = Integer.parseInt(input[2]);
                    int temp = numbers.get(a);
                    numbers.set(a, numbers.get(b));
                    numbers.set(b, temp);

                    break;
                case "multiply":
                    int c = Integer.parseInt(input[1]);
                    int d = Integer.parseInt(input[2]);
                    int temp2 = numbers.get(c) * numbers.get(d);
                    numbers.set(c, temp2);

                    break;
                case "decrease":
                    for (int i = 0; i < numbers.size(); i++) {
                        numbers.set(i, numbers.get(i) - 1);
                    }

                    break;
            }

            command = scanner.nextLine();
        }
        if ("End".equalsIgnoreCase(command))
        System.out.println(numbers.toString().replaceAll("[\\[\\]]", ""));   //4 53 6 8 43 3

    }
}
