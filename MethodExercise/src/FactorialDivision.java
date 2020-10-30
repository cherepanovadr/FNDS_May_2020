import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        if (a == 0) {
            a=1;
        }
        if (b==0) {
            b =1;
        }
        System.out.printf("%.2f",factorial(a, b));
    }

    private static double factorial(long a, long b) {

        double c = 0;
        long facA = a;
        long facB = b;
        for (int i = 1; i < a; i++) {

            facA = facA * i;
        }
        for (int i = 1; i < b; i++) {
            facB = facB * i;

        }
        return  c = facA * 1.0 / facB;

    }
}
