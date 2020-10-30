import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = readInlist(scanner);

        String input = scanner.nextLine();
        while (!"end".equals(input)) {
            String[] tokens = input.split("\\s+");
            String command = tokens[0];
            int element = Integer.parseInt(tokens[1]);
            if ("Delete".equals(command)) {
                while (numbers.contains(element)) {
                    numbers.remove(Integer.valueOf(element));
                }


            } else if ("Insert".equals(command)) {
                int position = Integer.parseInt(tokens[2]);
                if (position >= 0 && position < numbers.size()) {
                    numbers.add(position, element);

                }

            }

            input = scanner.nextLine();
        }
        printList(numbers);
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


