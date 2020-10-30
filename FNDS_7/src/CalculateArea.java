import java.util.Scanner;

public class CalculateArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
int area = area(width,length);
        System.out.println(area);

    }

    private static int area(int a, int b) {
        return a*b;
    }

}
