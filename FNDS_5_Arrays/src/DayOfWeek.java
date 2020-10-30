import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] daysOfWeek = {"Monday", "Tuesday",
                "Wednesday", "Thursday", "Friday",
                "Saturday", "Sunday"};
        int dayNum = Integer.parseInt(scanner.nextLine());
        if (dayNum >= 1 && dayNum <= 7) {
            System.out.println(daysOfWeek[dayNum-1]);
        } else {
            System.out.println("Invalid day!");
        }

    }
}
