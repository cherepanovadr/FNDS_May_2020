import java.util.*;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        Map<String, List<String>> synonyms = new LinkedHashMap<>();
        for (int i = 0; i < a; i++) {
            String key = scanner.nextLine();
            String synonym = scanner.nextLine();
            synonyms.putIfAbsent(key,new ArrayList<>());
            synonyms.get(key).add(synonym);
            }


        for (Map.Entry<String, List<String>> entry : synonyms.entrySet()) {
            System.out.printf("%s - %s%n", entry.getKey(), entry.getValue()
                    .toString()
                    .replaceAll("[\\]\\[]",
                            ""));

        }
    }
}
