import java.util.Arrays;
import java.util.Scanner;

public class OddTimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] items = scanner.nextLine().split(" ");

        int[] arr = Arrays.stream(items).mapToInt(e -> Integer.parseInt(e)).toArray();
        //1 2 3 2 3 1 3
   //4.	Use XOR (^) of result and all numbers in the array.
        //a.	XOR of two elements is 0 if both elements are same and XOR of a number x with 0 is x
        //5.	Print the result.
        for (int i : arr) {
            int count = 0;

            for (int i1 :arr) {
                int XOR = i1 ^ i;
                if (XOR == 0) {
                    count++;
                }
            }
            if (count % 2 != 0) {
                System.out.println(i);
                return;
            }
        }
    }
}