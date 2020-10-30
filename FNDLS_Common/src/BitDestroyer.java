import java.util.Scanner;

public class BitDestroyer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int p = Integer.parseInt(scanner.nextLine());
        int mask = ~(1 << p);
        int result = (number & mask);

        System.out.println(result);

    }
}

