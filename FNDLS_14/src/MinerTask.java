import java.sql.SQLOutput;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> items = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equalsIgnoreCase("stop")) {
            int count = Integer.parseInt(scanner.nextLine());
            items.putIfAbsent(input, 0);
            int newCount = items.get(input) + count;
            items.put(input, newCount);

            input = scanner.nextLine();
        }
        items
                .forEach((k,v) -> System.out.println(String.format("%s -> %d", k,v)));

    }
}
