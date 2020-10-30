import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.equalsIgnoreCase("End")) {
            int number = Integer.parseInt(input);
            if (isPalindrome(number)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
            input = scanner.nextLine();
        }
        if (input.equalsIgnoreCase("End")) {
            return;
        }
    }

    private static boolean isPalindrome(int number) {
        int original = number;
        int palindrome = 0;
        while (number > 0) {
            int digit = number % 10;
            palindrome = palindrome * 10 + digit;
            number = number / 10;
        }
boolean result = original == palindrome;
        return result;
    }


}
