import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String pass = "";
        for (int i = username.length() - 1; i >= 0; i--) {
            pass += username.charAt(i);
        }

boolean isLogged = false;
        for (int i = 1; i < 4; i++) {
        String inputPass = scanner.nextLine();
            if (inputPass.equals(pass)) {
                isLogged =true;
                System.out.printf("User %s logged in.", username);
                break;
            }
                System.out.println("Incorrect password. Try again.");
            }
        if (!isLogged) {
            System.out.printf("User %s blocked!", username);
        }
        }
    }
