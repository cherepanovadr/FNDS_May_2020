import java.util.Scanner;

public class Multiplication20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    int a = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        int i=n;
        do {
            System.out.printf("%d X %d = %d%n", a, i, a*i);
i++;

        }
        while (i<=10);
    }
}
