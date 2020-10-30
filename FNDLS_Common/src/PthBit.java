import java.util.Scanner;

public class PthBit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int p = Integer.parseInt(scanner.nextLine());
int pNumb = (number>>p)&1;
        System.out.println(pNumb);
    }
}
