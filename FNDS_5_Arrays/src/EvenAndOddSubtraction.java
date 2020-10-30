import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        int oddSum = 0;
        int evenSum = 0;
        for (int current : arr) {
               if (current % 2 == 0) {
                evenSum += current;
            } else {
                oddSum += current;
            }

        }
        System.out.print(evenSum - oddSum);
    }
}
