import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = readInlist(scanner);
        int[] bobInfo = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int bomb = bobInfo[0];
        int power = bobInfo[1];

        while (numbers.contains(bomb)) {
            int index = numbers.indexOf(bomb);

            int leftBound = Math.max(index - power, 0);
            int rightBound = Math.min(index + power, numbers.size() - 1);
            for (int i = rightBound; i >= leftBound; i--) {
                numbers.remove(i);
            }
        }
        int sum = sumList(numbers);
        System.out.println(sum);

    }

    private static int sumList(List<Integer> numbers) {
        int result = 0;
        for (Integer number : numbers) {
            result += number;

        }
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

