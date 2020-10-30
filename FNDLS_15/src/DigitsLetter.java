import java.util.Scanner;

public class DigitsLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder other = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);

            if (Character.isDigit(ch)) {
                digits.append(ch);
            } else if (Character.isAlphabetic(ch)) {
                letters.append(ch);
            } else {
                other.append(ch);
            }
        }
        System.out.println(digits);
        System.out.println(letters);
        System.out.println(other);


    }
}
