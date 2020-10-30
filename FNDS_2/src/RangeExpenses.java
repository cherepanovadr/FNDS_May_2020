import java.util.Scanner;

public class RangeExpenses {
    public static void main(String[] args) {
//headset, mouse, keyboard and display.
        //Every second lost game, Pesho trashes his headset.
        //Every third lost game, Pesho trashes his mouse.
        //When Pesho trashes both his mouse and headset in the same lost game, he also trashes his keyboard.
        //Every second time, when he trashes his keyboard, he also trashes his display.

        Scanner scanner = new Scanner(System.in);
        int lostGamesCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());
        double headsetTotal = lostGamesCount / 2 * headsetPrice;
        double mouseTotal = lostGamesCount / 3 * mousePrice;
        double keyboardTotal = lostGamesCount / 6 * keyboardPrice;
        double displayTotal = lostGamesCount / 12 * displayPrice;
        double sum = headsetTotal + mouseTotal + keyboardTotal + displayTotal;
        System.out.printf("Rage expenses: %.2f lv.",sum);


    }
}
