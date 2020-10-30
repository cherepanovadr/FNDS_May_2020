import java.util.Scanner;

public class exam1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int aPerHour = Integer.parseInt(scanner.nextLine());
        int bPerHour = Integer.parseInt(scanner.nextLine());
        int cPerHour = Integer.parseInt(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        int capacity = aPerHour + bPerHour + cPerHour;

        int hours = 0;
        while (students > 0) {
            hours++;
            if (hours % 4 == 0) {
                continue;
            }
            students -= capacity;
        }

        System.out.printf("Time needed: %dh.", hours);
    }
}
