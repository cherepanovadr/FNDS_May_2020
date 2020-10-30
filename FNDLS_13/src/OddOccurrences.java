import java.util.*;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");
        Map<String, Integer> counts = new LinkedHashMap<>();
        for (String s : words) {
            String lowerCase = s.toLowerCase();
            int count = 0;

            if (counts.containsKey(lowerCase)) {
                counts.put(lowerCase, counts.get(lowerCase) + 1);

            } else {
                counts.put(lowerCase, 1);

            }
        }

        List<String> odds = new ArrayList<>();
        for (var entry : counts.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                odds.add(entry.getKey());
            }
        }
            for (int i = 0; i < odds.size(); i++) {
                System.out.print(odds.get(i));
                if (i <odds.size() -1) {
                    System.out.print(", ");
                }

            }

        }




}


