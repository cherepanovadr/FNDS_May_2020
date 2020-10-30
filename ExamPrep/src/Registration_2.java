import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Registration_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        String regex = "U\\$(?<username>[A-Z][a-z][a-z]+)U\\$P@\\$(?<password>[A-Za-z]{5,}\\d+)P@\\$";
        Pattern pattern = Pattern.compile(regex);
        for (int i = 0; i < a; i++) {
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
//You must check if the registration is valid and if it is print:
//"Registration was successful"
//"Username: {Username}, Password: {Password}"
//If it isn’t - print the following message:
//"Invalid username or password"
//In the end print the count of successful registrations:
//"Successful registrations: {successfulRegistrationsCount}"
                String user = matcher.group("username");
                String password = matcher.group("password");
                System.out.println("Registration was successful");
                System.out.println(String.format("Username: %s, Password: %s", user, password));
                counter++;

            } else {
                System.out.println("Invalid username or password");
            }

        }
        System.out.println("Successful registrations: " + counter);

    }
}
