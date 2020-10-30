import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberCommands = Integer.parseInt(scanner.nextLine());
        List<String> list = new ArrayList<>();
        for (int i = 0; i < numberCommands; i++) {
            String[] tokens = scanner.nextLine().split("\\s+", 2);
            String name = tokens[0];
            if ("is going!".equals(tokens[1])) {
                if (list.contains(name)) {
                    System.out.printf("%s is already in the list!%n", name);
                } else {
                    list.add(name);
                }

            } else if ("is not going!".equals(tokens[1])) {
                if (list.contains(name)) {
                    list.remove(name);
                } else {
                    System.out.printf("%s is not in the list!%n", name);
                }
            }
        }
        for (String s : list) {
            System.out.println(s);

        }
    }

    private static void printList(List<Integer> list) {
        for (Integer integer : list) {
            System.out.print(integer + " ");

        }
    }

    private static List<String> readInlist(Scanner scanner) {
        List<String> output = new ArrayList<>();
        String[] input = scanner.nextLine().split("\\s+");
        for (String s : input) {
            output.add(s);
        }
        return output;
    }
}

