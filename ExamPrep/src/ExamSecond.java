import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExamSecond {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        List<String> check = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String regex = "([=/])(?<place>[A-Z][A-Za-z]{2,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()){
            String temp = matcher.group("place");
            sb.append(temp);
            check.add(temp);

        }
        System.out.print("Destinations: ");
        System.out.println(String.join(", ",  check));
        System.out.printf("Travel Points: %d",sb.length());
    }
}
