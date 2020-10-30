import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class NetherRealms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regexHealth = "([^\\d+\\-*.\\/])";
        String regexDamage = "(-?\\d+\\.?\\d*)";
        String optional = "[*/]";

        //The sum of the asci codes of all characters (excluding numbers (0-9), arithmetic symbols ('+', '-', '*', '/') and delimiter dot ('.')) gives a demon's total health.
        //The sum of all numbers in his name forms his base damage. Note that you should consider the plus '+' and minus '-' signs (e.g. +10 is 10 and -10 is -10). However, there are some symbols ('*' and '/') that can further alter the base damage by multiplying or dividing it by 2
        //  M3ph-0.5s-0.5t0.0**
        List<String> participantNames = Arrays.stream(scanner.nextLine().split("[, ]+"))
                .sorted(String::compareTo)
                .collect(Collectors.toList());

        Pattern patternLetter = Pattern.compile(regexHealth);
        Pattern patternDamage = Pattern.compile(regexDamage);
        Pattern patternOptional = Pattern.compile(optional);

        for (String participantName : participantNames) {
            Matcher matcherHealth = patternLetter.matcher(participantName);
            Matcher matcherDamage = patternDamage.matcher(participantName);
            Matcher matcherOptional = patternOptional.matcher(participantName);

            int health = 0;
            while (matcherHealth.find()) {
                health += matcherHealth.group().charAt(0);
            }

            double InitialDamage = 0;
            while (matcherDamage.find()) {
                double number = Double.parseDouble(matcherDamage.group());
                InitialDamage += number;
            }

            while (matcherOptional.find()) {
                if (matcherOptional.group().equals("*")) {
                    InitialDamage *= 2;
                } else {
                    InitialDamage /= 2;
                }
            }

            System.out.println(String.format("%s - %d health, %.2f damage", participantName, health, InitialDamage));

        }
    }
}