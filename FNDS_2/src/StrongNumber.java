import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String numberAsString = scanner.nextLine();
        int total = 0;
        for (int i = 0; i < numberAsString.length(); i++) {
            int digit = Integer.parseInt("" + numberAsString.charAt(i));
            int currentSum = 1;
            for (int j = 1; j <= digit; j++) {
                currentSum *= j;
            }
            total += currentSum;
        }
            int a = Integer.parseInt(numberAsString);
            if (total == a) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }

