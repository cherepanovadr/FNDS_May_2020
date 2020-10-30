import java.util.Scanner;

public class GreaterofTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        if (type.equals("int")) {
            int a = Integer.parseInt(scanner.nextLine());
            int b = Integer.parseInt(scanner.nextLine());
            System.out.println(getmax(a,b));

        } else if (type.equals("char")) {
            char a = scanner.nextLine().charAt(0);
            char b = scanner.nextLine().charAt(0);
            System.out.println(getmax(a,b));
        } else {
            String a = scanner.nextLine();
            String b = scanner.nextLine();
            System.out.println(getmax(a,b));
        }


    }

    private static int getmax(int a, int b) {
        int c = 0;
        if (a > b) {
            c = a;
        } else {
            c = b;
        }
        return c;
    }

    private static char getmax(char a, char b) {
        if (a > b) {
            return a;
        }  return b;
    }
    private static String getmax(String a, String b) {
        if (a.compareTo(b) >= 0) {
            return a;
        } else return b;
    }
    }
