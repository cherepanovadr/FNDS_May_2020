import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] text = scanner.nextLine().split("");
        Map<String, Integer> entry = new LinkedHashMap<>();
        for (int i = 0; i < text.length; i++) {
            String current = text[i];
            if (!current.equalsIgnoreCase(" ")) {
                entry.putIfAbsent(current, 0);
                int newCount = entry.get(current);
                entry.put(current, newCount + 1);
            }
        }
        for (Map.Entry<String, Integer> stringIntegerEntry : entry.entrySet()) {
            System.out.printf("%s -> %d%n", stringIntegerEntry.getKey(),stringIntegerEntry.getValue());

        }

    }


}
