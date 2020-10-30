import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RemoveNegatived {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] parts = scanner.nextLine().split(" ");
        List<Integer> nums = new ArrayList<>();

        for (String part : parts) {
            int current = Integer.parseInt(part);
            nums.add(current);
        }


            for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) < 0) {
                nums.remove(i);
                i = -1;
            }
        }

        Collections.reverse(nums);
            if (nums.size() == 0){
                System.out.println("empty");
            }else
        System.out.println(nums.toString().replaceAll("[\\[\\]\\,]",""));   //4 53 6 8 43 3

}
}
