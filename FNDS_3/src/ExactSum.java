import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
      BigDecimal sum =new BigDecimal(0);
        for (int i = 0; i < a; i++) {
            BigDecimal b = new BigDecimal(scanner.nextLine());
            sum = sum.add(b);

        }
        System.out.println(sum);
    }
}
