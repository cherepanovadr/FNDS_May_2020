import java.util.Scanner;

public class VendinMachine {
    public static void main(String[] args) {
        //while to sum coins until start
        // check their validity 0.1, 0.2, 0.5, 1, and 2 coins
        //Cannot accept {money}", where the value is formated to the second digit after the decimal point and not add it to the total money.

        //until end
        //"Nuts", "Water", "Crisps", "Soda", "Coke".
        // 2.0, 0.7, 1.5, 0.8, 1.0
        //non exisitng product -Invalid product
        //Sorry, not enough money OR Purchased {product name}".
        double collected = 0;
        double price = 0;
        boolean isValid = false;
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        while (!command.equalsIgnoreCase("Start")) {
            double coin = Double.parseDouble(command);
            if (coin == 0.1 || coin == 0.2 || coin == 0.5 || coin == 1 || coin == 2) {
                collected += coin;
            } else {
                System.out.printf("Cannot accept %.2f%n", coin);
            }
            command = scanner.nextLine();
        }
        if (command.equalsIgnoreCase("Start")) {
            command = scanner.nextLine();
        }
        while (!command.equalsIgnoreCase("End")) {
            if (command.equalsIgnoreCase("nuts")) {
                price = 2;
            } else if (command.equalsIgnoreCase("Water")) {
                price = 0.7;
            } else if (command.equalsIgnoreCase("Crisps")) {
                price = 1.5;
            } else if (command.equalsIgnoreCase("Soda")) {
                price = 0.8;
            } else if (command.equalsIgnoreCase("Coke")) {
                price = 1;
            } else {
                System.out.printf("Invalid product%n");
                isValid = true;
           }
            if (collected >= price && !isValid) {
                System.out.printf("Purchased %s%n", command);
                collected -= price;
            } else if (collected < price && !isValid ){
                System.out.printf("Sorry, not enough money%n");
            }
            command = scanner.nextLine();
        }
        if (command.equalsIgnoreCase("End")){
            System.out.printf("Change: %.2f", collected);
        }

        }

    }

