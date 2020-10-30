import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        printTriangle(a);
    }

    public static void printTriangle(int a) {
        printTopHalf(a);
        printBottomHalf(a-1);


    }

    private static void printTopHalf(int numberofRows) {
        for (int i = 1; i <= numberofRows; i++) {
            printRow(1, i);
            System.out.println();
        }
    }

    private static void printBottomHalf(int longestLine) {
        for (int i = longestLine; i >= 1 ; i--) {
            printRow(1,i);
            System.out.println();

        }
    }

    private static void printRow(int from, int to) {
        for (int i = 1; i <= to; i++) {
            System.out.print(i +" ");

        }
    }
}
