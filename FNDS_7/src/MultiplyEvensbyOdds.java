import java.util.Scanner;

public class MultiplyEvensbyOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
 int multi = getMultiple(a);
        System.out.println(multi);
    }

    private static int getMultiple(int a) {
        a = Math.abs(a);
        int multiply = 0;
        int current = 0;
        int oddSum = 0;
        int evenSum = 0;
        for (int i = 1; a> 0; i++) {

            current = a % 10;
            if (current % 2 == 0) {
                evenSum += current;
            } else {
                oddSum += current;
            }
            a = a/10;
        }
        multiply = evenSum * oddSum;
        return multiply;


    }
}
