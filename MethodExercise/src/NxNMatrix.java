import java.util.Scanner;

public class NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        height(widthh(a),a);
    }

    private static void height(String widthh, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(widthh);

        }
    }

    private static String widthh(int a) {
        String b ="";
        for (int i = 0; i <a ; i++) {
             b = b + a +" ";

        }
        return b;
    }
}
