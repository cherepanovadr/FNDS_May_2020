import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//Write a program that reads an array of strings.
// Each string is repeated n times, where n is the length
// of the string.
// Print the concatenated string.

        String[] words = scanner.nextLine().split("\\s+");
        StringBuilder output = new StringBuilder();
        for (String word : words) {
            int count = word.length();
            for (int i = 0; i <count; i++) {
                output.append(word);

            }

        }
        System.out.print(output);

    }
}

