import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> nums = Arrays.asList(scanner.nextLine().split(" "));
        nums.stream() //1 2 3 4 5 6
                .map(str -> Integer.parseInt(str))
                .filter(a -> a % 2 == 0)
                //intermediate operation
                .sorted()
                .forEach(num -> System.out.println(num)); //2 4 6

    }
}


