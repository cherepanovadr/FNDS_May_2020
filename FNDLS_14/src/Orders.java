import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, Integer> quantityMap = new LinkedHashMap<>();
        Map<String, Double> priceMap = new LinkedHashMap<>();


        while (!input.equalsIgnoreCase("buy")) {
            String[] tokens = input.split("\\s+");

            String product = tokens[0];
            double price = Double.parseDouble(tokens[1]);
            int quantity = Integer.parseInt(tokens[2]);

            priceMap.put(product, price);
            quantityMap.putIfAbsent(product, 0);
            int newQuantity = quantityMap.get(product) + quantity;
            quantityMap.put(product, newQuantity);

            input = scanner.nextLine();
        }

        quantityMap.forEach((k, v) -> System.out.println(String.format("%s -> %.2f", k, v * priceMap.get(k))));


    }
}
