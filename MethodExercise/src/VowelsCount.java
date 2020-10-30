import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        countVowels(input);
    }

    private static void countVowels(String input) {
        int counter = 0;
        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);

             switch (current) {
                case 'a':
                 case 'A':
                 case 'e':
                case 'i':
                case 'o':
                case 'u':
                 case 'E':
                 case 'I':
                 case 'O':
                 case 'U':
                    counter++;
                    break;
            }

        }
        System.out.println(counter);
    }
}
