import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        if (command.equals("add")){
            printAdd(a,b);

        }
        if (command.equals("multiply")){
            printMultiply(a,b);
        }
        if (command.equals("subtract")){
            printSubtract(a,b);
        }
        if (command.equals("divide")) {
            printDivide(a,b);
        }


    }

    private static void printSubtract(int a, int b) {
        System.out.println(a-b);

    }
    private static void printDivide(int a, int b) {
        System.out.println(a/b);
    }

    private static void printMultiply(int a, int b) {
        System.out.println(a*b);
    }

    private static void printAdd(int a, int b) {
        System.out.println(a+b);
    }
}