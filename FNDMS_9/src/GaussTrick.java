import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] parts = scanner.nextLine().split(" ");
        List<Integer> number = new ArrayList<>();
        for (String part : parts) {
            int current = Integer.parseInt(part);
            number.add(current);
            // 1 2 3 4 5
            // 6 2 3 4
            //  2 + 4


        }
        for (int i = 0; i < number.size(); i++) {
            if (i == number.size()-1){
                break;
            }
            int last = number.get(number.size() - 1);
            int current = number.get(i);
            number.set(i, current + last);
            number.remove(number.size() - 1);

        }
        for (Integer s : number) {
            System.out.print(s + " ");

        }


    }
}
