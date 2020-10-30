import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstLine = scanner.nextLine();
        String secondLine = scanner.nextLine();
        List<Integer> first = inputToList(firstLine);
        List<Integer> second = inputToList(secondLine);
        int minLength = Math.min(first.size(), second.size());
        for (int i = 0; i < minLength; i++) {
            System.out.print(first.get(i) + " ");
            System.out.print(second.get(i) + " ");

        }
        printAfterIndex(first, minLength);
        printAfterIndex(second, minLength);

    }

    private static void printAfterIndex(List<Integer> list, int startIndex) {
        for (int i = startIndex; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");

        }


    }

    private static List<Integer> inputToList(String firstLine) {
        String[] parts = firstLine.split(" ");

        List<Integer> result = new ArrayList<>();

        for (String part : parts) {
            int current = Integer.parseInt(part);
            result.add(current);

        }
        return result;
    }
}
