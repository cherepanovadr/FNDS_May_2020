import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        String output = "";
        if (a % 10 == 0) {
            output = "The number is divisible by 10";
        } else if (a % 7 == 0) {
            output = "The number is divisible by 7";
        } else if (a % 6 == 0) {
            output = "The number is divisible by 6";
        } else if (a % 3 == 0) {
            output = "The number is divisible by 3";
        } else if (a % 2 == 0) {
            output = "The number is divisible by 2";
        }
        if (output.equals("")) {
            System.out.println("Not divisible");
        } else {
            System.out.println(output);
        }
    }}
