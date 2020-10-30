import javax.naming.PartialResultException;
import java.util.Scanner;

public class ReverseArrayofStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] parts = scanner.nextLine().split(" ");
        for (int i = 0; i < parts.length/2; i++) {
            //swap
            // 0 - legnth -1
            // 1- length-2
            // 2- length -3
            String tmp = parts[i];
            int swapIndex = parts.length - i - 1;
            parts[i] = parts[swapIndex];
            parts[swapIndex] = tmp;

        }
        System.out.println(String.join(" ", parts));

    }
}
