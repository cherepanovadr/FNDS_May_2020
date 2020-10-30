import java.util.*;

public class More2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        Map<String, List<String>> wordSynonyms = new TreeMap<>();
        for (int i = 0; i < a; i++) {
            String word = scanner.next();
            String synonyms = scanner.next();
      List<String> syn = wordSynonyms.get(word);
      if(syn == null) {
          syn = new ArrayList<>();
          
      }

    }
}}
