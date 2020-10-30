import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class More_EncryptSortandPrintArray {
    public static void main(String[] args) {
        Map<String, Integer> encrypted = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < a; i++) {
            String city = scanner.nextLine();
            //•	The code of each vowel multiplied by the string length
            //•	The code of each consonant divided by the string length
// peter -  80/5 - 101*5  116/5  101*5 114/5   16+ 505 +23.2 + 505  +22.8
            boolean isVowel = false;
            int sum = 0;

            for (int j = 0; j < city.length(); j++) {
                char current = city.charAt(j);
                switch (current) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U':
                        isVowel = true;
                        break;
                }
                if (isVowel == true) {
                    current *= city.length();
                    sum += current;
                    isVowel = false;
                } else {
                    if (city.length() > 0) {
                        current /= city.length();
                        sum += current;
                    }
                }

            }
            encrypted.putIfAbsent(city, 0);
            encrypted.put(city, sum);

        }
        encrypted
                .entrySet()
                .stream()
                .sorted((l, r) -> l.getValue() - r.getValue())
                .forEach(s -> System.out.println(String.format("%d", s.getValue())));


    }
}
