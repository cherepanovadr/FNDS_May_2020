import java.util.Scanner;

public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split("\\s+");
        double finalSum = 0;
        for (String word : words) {
            char firstLetter = word.charAt(0);
            char lastLetter = word.charAt(word.length() - 1);
            String numAsString = word.substring(1, word.length() - 1);
            long number = Integer.parseInt(numAsString);
            double result = 0.0;
            if (Character.isUpperCase(firstLetter)) {
                result = number * 1.0 / (firstLetter - 64);
            } else {
                result = number * (firstLetter - 96);
            }
            if (Character.isUpperCase(lastLetter)) {
                result -= lastLetter - 64;
            } else {
                result += lastLetter - 96;

            }
            finalSum+=result;
        }
        System.out.println(String.format("%.2f",finalSum));

    }
}
