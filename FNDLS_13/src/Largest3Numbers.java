import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Arrays.stream(scanner.nextLine().split(" "))
                .map(n -> Integer.parseInt(n))
                .sorted((l,r) -> r.compareTo(l))
                .limit(3)
                .forEach(n -> System.out.print(n + " "));



    }
}
