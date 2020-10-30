import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class second {
    public static void main(String[] args) {
        String regex = "(\\d{2})([/.\\-|])([A-Z][a-z]{2})\\2(\\d{4})";
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        List<String> names = new ArrayList<>();

        while(matcher.find()) {
            names.add("Day: " + matcher.group(1) + ", Month: " + matcher.group(3) + ", Year: " + matcher.group(4));

        }
        System.out.println(String.join("\n", names));

    }
}
