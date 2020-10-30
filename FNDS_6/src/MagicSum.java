import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] row = scanner.nextLine().split(" ");
        int[] num = new int[row.length];
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(row[i]);
        }
        int sum = Integer.parseInt(scanner.nextLine());
        int current = 0;
        for (int i = 0; i < num.length; i++) {
            current = num[i];
            for (int j = i+1; j < num.length; j++) {
                if (sum == current + num[j]) {
                    System.out.printf("%d %d%n",current,num[j]);
                }

            }

        }
    }
}
