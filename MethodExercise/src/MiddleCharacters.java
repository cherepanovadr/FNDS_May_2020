import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 123456 -34   6%2=0 6/2 = 3 3+1
        //12345 -3       5%2=1 5/2 = 2. 2+1


        String input = scanner.nextLine();
        middle(input);
    }

    private static void middle(String input) {
        if (input.length() % 2 != 0) {
            char current = input.charAt(input.length() / 2);
            System.out.println(current);
        } else {
            char current = input.charAt(input.length() / 2 + 1);
            System.out.printf("%c%c",input.charAt(input.length() / 2-1),input.charAt(input.length() / 2));

        }


    }
}
