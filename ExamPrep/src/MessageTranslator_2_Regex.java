import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MessageTranslator_2_Regex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        String regex="!([A-Z][a-z][a-z]+)!:\\[([A-Za-z]{8,})\\]";
        Pattern pattern = Pattern.compile(regex);

        for (int i = 0; i < a ; i++) {
            String massage = scanner.nextLine();
            Matcher matcher = pattern.matcher(massage);
            if(matcher.find()){
                String toEncode = matcher.group(2);
                System.out.print(matcher.group(1) +":");
                for (int j = 0; j <toEncode.length() ; j++) {
                    System.out.print(" " + (int) toEncode.charAt(j));
                }
                System.out.println();
            } else{
                System.out.println("The message is invalid");
            }
        }

    }
}
