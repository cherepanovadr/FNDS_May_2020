import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//planet name -> planet population -> attack type -> soldier count.
//Each part can be separated from the others by any character except: '@', '-', '!', ':' and '>'.
        String regex = "[starSTAR]";
        String decrypt = "@(?<name>[A-Za-z]+)[^@\\-!:>]*:(?<population>\\d+)[^@\\-!:>]*!(?<attack>A|D)![^@\\-!:>]*->(?<soldier>\\d+)";
        int a = Integer.parseInt(scanner.nextLine());
        Pattern pattern = Pattern.compile(regex);
        int count = 0;
        Map<String, List<String>> planets = new TreeMap<>();
        planets.put("Attacked", new ArrayList<>());
        planets.put("Destroyed", new ArrayList<>());


        for (int i = 0; i < a; i++) {
            StringBuilder sb = new StringBuilder();
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);
            while (matcher.find()) {
                count++;
            }
            for (int j = 0; j < input.length(); j++) {
                char current = input.charAt(j);
                sb.append((char) (current - count));
            }
            count = 0;
            Pattern pattern2 = Pattern.compile(decrypt);
            Matcher matcher2 = pattern2.matcher(sb);

            while (matcher2.find()) {
                String name2 = matcher2.group("name");

                char attack = matcher2.group("attack").charAt(0);
                if (attack=='A') {
                    planets.putIfAbsent("Attacked", new ArrayList<>());
                    planets.get("Attacked").add(name2);

                } else if (attack=='D') {
                    planets.get("Destroyed").add(name2);

                }


            }

        }
        planets
                .entrySet()
                .stream()
                .sorted((c, d) -> c.getKey().compareTo(d.getKey()))
                .forEach(entry -> {
                    System.out.println(String.format("%s planets: %d", entry.getKey(), (entry.getValue().size())));
                    entry
                            .getValue()
                            .stream()
                            .sorted((s1, s2) -> s1.compareTo(s2))
                            .forEach(s -> System.out.println(String.format("-> %s", s)));

                });


    }
}
