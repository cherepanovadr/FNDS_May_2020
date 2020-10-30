import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int[] arr2 = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int sum = 0;
        boolean isDiff = false;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] != arr2[i]) {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                isDiff = true;
                break;
            }
        }
       if (!isDiff) {
        System.out.printf("Arrays are identical. Sum: %d", sum);

    }

}}
