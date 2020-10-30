import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        int times = Integer.parseInt(scanner.nextLine());
        System.out.println(newString(a, times));
    }

    private static String newString(String a, int b) {
        String c = "";
        for (int i = 0; i < b; i++) c += a;
        return c;
    }
}
