import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String letterRegex = "(?<name>[A-Za-z])";
        String digitRegex = "(?<numbers>[0-9])";
        Map<String, Integer> race = new LinkedHashMap<>();
        Pattern digitPattern = Pattern.compile(digitRegex);
        Pattern letterPattern = Pattern.compile(letterRegex);
        List<String> participants = new ArrayList<>();
        String[] input = scanner.nextLine().split(", ");
        for (String s : input) {
            participants.add(s);
        }
        // List<String> participants2 = Arrays.stream(scanner.next().split(", ")).collect(Collectors.toList());
        String inputLine = scanner.nextLine();
        while (!"end of race".equalsIgnoreCase(inputLine)) {
            StringBuilder sb = new StringBuilder();
            Matcher letterMatcher = letterPattern.matcher(inputLine);
            while (letterMatcher.find()) {
                sb.append(letterMatcher.group());
            }
            if (participants.contains(sb.toString())) {
                race.putIfAbsent(sb.toString(), 0);
                int km = race.get(sb.toString());
                Matcher digitMatcher = digitPattern.matcher(inputLine);
                while (digitMatcher.find()) {
                    km += Integer.parseInt(digitMatcher.group());
                }
                race.put(sb.toString(), km);
            }

            inputLine = scanner.nextLine();
        }
        String[] output = {"1st place: ", "2nd place: ", "3rd place: "};
        List<String> outputResult = new ArrayList<>();
        outputResult.add("1st place: ");
        outputResult.add("2nd place: ");
        outputResult.add("3rd place: ");

        race
                .entrySet()
                .stream()
                .sorted((r1, r2) -> r2.getValue().compareTo(r1.getValue()))
                .limit(3)
                .forEach(r -> {

                    System.out.println(outputResult.remove(0)+r.getKey());

                });

    }
}
