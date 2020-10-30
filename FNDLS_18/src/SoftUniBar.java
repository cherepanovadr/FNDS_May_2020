import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "%(?<name>[A-Z][a-z]+)%[^|$%.]*<(?<product>\\w+)>[^|$%.]*\\|(?<count>\\d+)\\|[^|$%.]*?(?<price>\\d+\\.?\\d+)\\$";
//%George%<Croissant>|2|10.3$
//%Peter%<Gum>|1|1.3$
//%Maria%<Cola>|1|2.4$
        Pattern pattern = Pattern.compile(regex);
        Map<String, List> map = new LinkedHashMap<>();
        List<String> names = new ArrayList<>();
        double income = 0.0;
        String input = scanner.nextLine();
        while (!"end of shift".equalsIgnoreCase(input)) {
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String name = matcher.group("name");
                String product = matcher.group("product");
                int count = Integer.parseInt(matcher.group("count"));
                double price = Double.parseDouble(matcher.group("price"));
                double totalPrice = count * price;
                income+=totalPrice;
                System.out.println(String.format("%s: %s - %.2f", name, product, totalPrice));

            }


            input = scanner.nextLine();
        }
        System.out.println(String.format("Total income: %.2f", income));
    }


}
