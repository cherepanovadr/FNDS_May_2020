import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int groupNumber = Integer.parseInt(scanner.nextLine());
        String groupType = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 0;
        if (groupType.equals("Students")) {
            switch (day) {
                case "Friday":
                    price = 8.45;
                    break;
                case "Saturday":
                    price = 9.80;
                    break;
                case "Sunday":
                    price = 10.46;
                    break;
            }
        } else if (groupType.equals("Business")) {
            switch (day) {
                case "Friday":
                    price = 10.90;
                    break;
                case "Saturday":
                    price = 15.60;
                    break;
                case "Sunday":
                    price = 16;
                    break;
            }
        } else if (groupType.equals("Regular")) {
            switch (day) {
                case "Friday":
                    price = 15;
                    break;
                case "Saturday":
                    price = 20;
                    break;
                case "Sunday":
                    price = 22.50;
                    break;
            }
        }
        double total = price * groupNumber;
        if (groupType.equals("Students") && groupNumber >= 30) {
            total = 0.85 * total;
        } else if (groupType.equals("Business") && groupNumber >= 100) {
            total = price * (groupNumber - 10);
        } else if (groupType.equals("Regular") && groupNumber >= 10 && groupNumber <= 20) {
            total = 0.95 * total;
        }
        System.out.printf("Total price: %.2f", total);
    }
    }