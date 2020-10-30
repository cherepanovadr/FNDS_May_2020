import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class exam3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] parts = scanner.nextLine().split("\\s+");
        List<Integer> numbers = new ArrayList<>();
        for (String part : parts) {
            int current = Integer.parseInt(part);
            numbers.add(current);
        }
        //average count
        // greater than avrage if
        // seperate List in descneding order
        //if zero  - no
        int sum = 0;
        double avr = 0;
        for (Integer number : numbers) {
            sum = sum + number;
            avr = sum * 1.00 / numbers.size();
        }
        List<Integer> finalList = new ArrayList<>();

        for (Integer number : numbers) {
            if (number > avr) {
                finalList.add(number);
            }
        }

        Collections.sort(finalList);
        Collections.reverse(finalList);
        if (finalList.size() == 0) {
            System.out.println("No");
        } else if (finalList.size() > 5) {
            for (int i = 0; i < 5; i++) {
                System.out.print(finalList.get(i) + " ");
            }
            } else {
                System.out.println(finalList.toString().replaceAll("[\\[\\]\\,]", ""));   //4 53 6 8 43 3
            }


        }


    }
