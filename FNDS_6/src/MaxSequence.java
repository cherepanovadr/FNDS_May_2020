import java.util.Scanner;

public class MaxSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] row = scanner.nextLine().split(" ");
        int[] num = new int[row.length];
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(row[i]);
        }

        //2 1 1 2 3 3 2 2 2 1
        int count = 0;
        int max = 0;
        int value = 0;
        for (int i = 0; i < num.length - 1; i++) {
            if (num[i] == num[i + 1]) {
                count++;
                if (count > max) {
                    max = count;
                    value = num[i];
                }
            } else {
                count = 0;
                continue;
            }
        }
        for (int i = 0; i < max + 1; i++) {
            System.out.print(value + " ");
        }

    }

}

