import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//an "end" command.
// Write a program that reverses strings and printseach pair
// on separate line in format "{word} = {reversed word}".
        String text = scanner.nextLine();
        while (!"end".equalsIgnoreCase(text)) {
            List<String> output = new ArrayList();
            for (int i = text.length() - 1; i >= 0; i--) {
                char current = text.charAt(i);
                output.add(current + "");

            }
            String n = String.join("", output);
            System.out.printf("%s = %s%n", text, n);
            text = scanner.nextLine();
        }

    }
}
