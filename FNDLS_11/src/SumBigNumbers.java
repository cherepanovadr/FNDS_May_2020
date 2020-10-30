import java.math.BigInteger;
import java.util.Scanner;

public class SumBigNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger first = new BigInteger(scanner.nextLine());
        BigInteger second = new BigInteger(scanner.nextLine());
        BigInteger sum = new BigInteger(String.valueOf(0));
        sum = first.add(second);
        System.out.println(sum);
    }
}
