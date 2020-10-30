import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());

        System.out.println(new DecimalFormat("0.####").format(powerIt(a,b)));
    }

    private static double powerIt(double a, double b) {
        return Math.pow(a,b);
    }
}
