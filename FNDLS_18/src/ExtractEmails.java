import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "[^-_\\.]\\b(?<user>[A-Za-z\\d]+[\\._-]?[A-Za-z\\d]+)@(?<host>[A-Za-z\\-]+\\.[a-z]+\\.?[a-z]+)\\b";
        String input = scanner.nextLine();
        Pattern pattern= Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);


        while (matcher.find()){
            String email = matcher.group();
            System.out.println(email);

        }

    }
}
