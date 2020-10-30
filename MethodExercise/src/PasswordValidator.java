import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        boolean digitsMinPass = true;
        boolean noCharsPass = true;
        boolean characterrMINPass = true;

        digitsMinPass= characterrMIN(input);
        noCharsPass = noChars(input);
        characterrMINPass = digitsMin(input);
        if (digitsMinPass && noCharsPass&&characterrMINPass){
            System.out.println("Password is valid");
        }

    }

    private static boolean digitsMin(String input) {
        boolean digitsMinPass = true;
        int digCount = 0;
        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            if ((int) current >= 48 && (int) current < 58) {
                digCount++;
            }
        }
        if (digCount < 2) {
            System.out.println("Password must have at least 2 digits");
            digitsMinPass = false;
        }
        return digitsMinPass;
    }

    private static boolean noChars(String input) {
        boolean noCharsPass = true;
        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            if ((int) current < 48 || ((int) current > 57 && (int) current < 65) ||
                    ((int) current > 90 && (int) current < 97) ||
                    (int) current > 122) {
                System.out.println("Password must consist only of letters and digits");
                noCharsPass = false;
                break;
            }
        }
        return noCharsPass;
    }

    private static boolean characterrMIN(String input) {
        boolean characterrMINPass = true;
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
           // if ((int) current <48 || (int) current > 57) {
                count++;
       //     }
        }
        if (count < 6 || count > 10) {
            System.out.println("Password must be between 6 and 10 characters");
            characterrMINPass = false;
        }
        return characterrMINPass;
    }


}