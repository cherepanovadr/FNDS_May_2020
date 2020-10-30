import java.util.Scanner;

public class orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        double price = 0;
        switch (product){
            case "coffee":
                price=1.5;
                break;
            case "water":
                price = 1;
                break;
            case "snacks":
                price = 2;
                break;
            case "coke":
                price=1.4;
                break;
        }
        calcPrice(price,quantity);


    }

    private static void calcPrice(double price, int quantity) {
        System.out.printf("%.2f",price*quantity);
    }


}
