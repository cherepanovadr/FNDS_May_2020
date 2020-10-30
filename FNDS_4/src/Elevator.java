import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        int cap = Integer.parseInt(scanner.nextLine());

        int runs = people / cap;

        if (runs * cap < people ) {
            runs = runs + 1;
        }
        System.out.println(runs);

    }
}
