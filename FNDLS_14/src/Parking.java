import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Parking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> parking = new LinkedHashMap<>();
        int a = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < a; i++) {
            String[] data = scanner.nextLine().split(" ");
            String command = data[0];
            String name = data[1];

            switch (command) {
                case "register":
                    String number = data[2];
                    if (parking.containsKey(name)) {
                        System.out.printf("ERROR: already registered with plate number %s%n", number);
                    } else {
                        parking.putIfAbsent(name, number);

                        System.out.printf("%s registered %s successfully%n", name, number);
                    }
                    break;
                case "unregister":
                    if (!parking.containsKey(name)){
                        System.out.printf("ERROR: user %s not found%n",name);
                    } else {
                        parking.remove(name);
                        System.out.printf("%s unregistered successfully%n",name);
                    }
                    break;
            }


        }
        parking
                .entrySet()
                .stream()
                .forEach(s -> System.out.println(String.format("%s => %s", s.getKey(),s.getValue())));


    }
}
