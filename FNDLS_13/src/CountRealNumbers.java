import java.text.DecimalFormat;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] parts = scanner.nextLine().split(" ");
        Map<Double, Integer> occurances = new TreeMap<>();
        for (String part : parts) {
           double currentNumber = Double.parseDouble(part);
            if (occurances.containsKey(currentNumber)) {
                Integer currentCount = occurances.get(currentNumber);
                occurances.put(currentNumber, currentCount + 1);
            } else {
                occurances.put(currentNumber, 1);
            }
        }
        DecimalFormat decimal = new DecimalFormat("#.######");
        for (Map.Entry<Double, Integer> entry : occurances.entrySet()) {
            System.out.printf("%s -> %d%n",
                    decimal.format(entry.getKey()), entry.getValue());
        }
    }
}
