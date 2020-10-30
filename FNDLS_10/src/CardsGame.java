import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // while cycle comapring 0 cards until some of the lists ssixe is empty
        // 1 who is greater
        // if equal remove both
        String[] parts = scanner.nextLine().split(" ");
        List<Integer> deck1 = new ArrayList<>();
        for (String part : parts) {
            deck1.add(Integer.parseInt(part));
        }
        String[] parts2 = scanner.nextLine().split(" ");
        List<Integer> deck2 = new ArrayList<>();
        for (String part2 : parts2) {
            deck2.add(Integer.parseInt(part2));
        }
        boolean IsZero = (deck1.size() == 0) && (deck2.size() == 0);
        while ((deck1.size() > 0) && (deck2.size() >0)) {
            int i = 0;
            if (deck1.get(i) > deck2.get(i)) {
                deck1.add(Integer.valueOf(deck1.get(i)));
                deck1.add(Integer.valueOf(deck2.get(i)));
                deck1.remove(i);
                deck2.remove(i);
            } else if (deck2.get(i) > deck1.get(i)) {
                deck2.add(Integer.valueOf(deck2.get(i)));
                deck2.add(Integer.valueOf(deck1.get(i)));
                deck1.remove(i);
                deck2.remove(i);
            } else {
                deck1.remove(i);
                deck2.remove(i);
            }
        }
        int sum = 0;
        if (deck1.size() > deck2.size()) {
            for (Integer integer1 : deck1) {
                sum += integer1;
            }
            System.out.printf("First player wins! Sum: %d", sum);

        } else {
            for (Integer integer2 : deck2) {
                sum += integer2;
            }
            System.out.printf("Second player wins! Sum: %d", sum);
        }

    }

}
