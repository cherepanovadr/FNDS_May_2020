import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Name {
    public static void main(String[] args) {
        String regex = "\\b[A-Z][a-z]+ [A-Z][a-z]+\\b";
       Scanner scanner = new Scanner(System.in);
       String input = scanner.nextLine();

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(input);
        List<String> names = new ArrayList<>();
        while (matcher.find()){
            names.add(matcher.group());
        }
        System.out.println(String.join(" ",names));

    }
}
