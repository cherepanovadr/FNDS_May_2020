import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 0; a > 0; i++) {

            int currentDigit = a % 10;
            sum += currentDigit;
            a = a / 10;
        }
        System.out.println(sum);
    }
}
