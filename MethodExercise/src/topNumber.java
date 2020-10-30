import java.util.Scanner;

public class topNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        boolean oddDigit = false;
        boolean divideByEight = false;
        for (int i = 1; i <= a; i++) {
            divideByEight = divideByEight(i);
            oddDigit = oddDigit(i);
            if (divideByEight && oddDigit) {
                System.out.println(i);
            }
        }


    }

    private static boolean oddDigit(int i) {
        boolean result = false;
        int temp= i;
        for (int j = 0; temp > 0; j++) {
            int current = temp % 10;
            if (current % 2 != 0) {
                result = true;
                break;
            }
            temp = temp / 10;

        }
        return result;
    }

    private static boolean divideByEight(int i) {

        boolean result = false;
        int sum = 0;
        int temp = i;
        for (int j = 0; temp > 0; j++) {
            int current = temp % 10;
            sum += current;
            temp = temp / 10;
        }
        if (sum % 8 == 0) {
            result = true;
        }
        return result;

    }
}


