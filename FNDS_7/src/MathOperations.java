import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        char operator = scanner.nextLine().charAt(0);
        int b = Integer.parseInt(scanner.nextLine());
        switch (operator) {
            case '/':
                System.out.println(new DecimalFormat("0.####").format(calculateDevision(a,b)));
                break;
            case '*':
                System.out.println(new DecimalFormat("0.####").format(calculateMultiply(a,b)));
                break;
            case '+':
                System.out.println(new DecimalFormat("0.####").format(calculateSum(a,b)));
                break;
            case '-':
                System.out.println(new DecimalFormat("0.####").format(calculatSubtraction(a,b)));
                break;
        }

    }

    private static double calculatSubtraction(int a, int b) {
        return a-b;
    }

    private static double calculateSum(int a, int b) {
        return a+b;
    }

    private static double calculateMultiply(int a, int b) {
        return a*b;
    }

    private static double calculateDevision(int a, int b) {
        return a*1.0/b;
    }
}
