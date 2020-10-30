import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        //aaaaabbbbbcdddeeeedssaa	abcdedsa
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        char base = input.charAt(0);
        sb.append(base);
        for (int i = 1; i < input.length(); i++) {
            char symbol = input.charAt(i);
            if (symbol != base) {
                sb.append(symbol);
                base = symbol;
            }

        }

        System.out.println(sb.toString());

    }
}
