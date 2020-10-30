
import java.util.Scanner;

public class TicketPricing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dayType = scanner.nextLine().toLowerCase();
        int age = Integer.parseInt(scanner.nextLine());
        String price = "Error!";
        if (age <= 18 & age >= 0) {
            switch (dayType) {
                case "Weekday":
                price = "12$";
                break;
                case "Weekend":
                    price="15$";
                    break;
                case "Holiday":
                    price="5$";
                  break;
            }
        }
        else if (age>18 & age<=64){
            switch (dayType) {
                case "Weekday":
                    price = "18$";
                    break;
                case "Weekend":
                    price= "20$";
                    break;
                case "Holiday":
                    price="12$";
             break;
            }}
             else if (age>64 & age<=122){
                switch (dayType) {
                    case "Weekday":
                        price = "12$";
                        break;
                    case "Weekend":
                        price= "15$";
                        break;
                    case "Holiday":
                        price="10$";
                      break;
                }}
if (price.equalsIgnoreCase("0"))
        System.out.println(price);
}}

