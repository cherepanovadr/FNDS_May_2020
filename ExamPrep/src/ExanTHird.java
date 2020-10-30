import java.util.*;

public class ExanTHird {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> library = new HashMap<>();
        Map<String, List<Double>> rating = new HashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("<->");
            String plant = tokens[0];
            int rarity = Integer.parseInt(tokens[1]);
            library.putIfAbsent(plant, 0);
            library.put(plant, rarity);
            rating.put(plant,new ArrayList<>());
        }
        String input = scanner.nextLine();
        while (!input.equals("Exhibition")) {
//•	Rate: {plant} - {rating} – add the given rating to the plant (store all ratings)
//•	Update: {plant} - {new_rarity} – update the rarity of the plant with the new one
//•	Reset: {plant} – remove all the ratings of the given plant
            String[] parts = input.split("\\s+");
            String action = parts[0];
            switch (action) {
                case "Rate:":
                    String plantName = parts[1];

                    double rateValue = Double.parseDouble(parts[3]);
                    if (rateValue>=0) {
                     if(library.containsKey(plantName)){
                    rating.putIfAbsent(plantName, new ArrayList<>());
                    List<Double> temp = rating.get(plantName);
                    temp.add(rateValue);
                     }else{    System.out.println("error");
                    }}else{
                        System.out.println("error");
                    }
                    break;
                case "Update:":
                    String plantName1 = parts[1];

                    if (library.containsKey(plantName1)) {
                        int oldRarity = library.get(plantName1);
                        int newRarity = Integer.parseInt(parts[3]);
                        library.put(plantName1, newRarity);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "Reset:":
                    String plantName2 = parts[1];

                    if (rating.containsKey(plantName2)) {
                        rating.get(plantName2).clear();
                    } else {
                        System.out.println("error");
                    }
                    break;
                default:
                    System.out.println("error");
            }

            input = scanner.nextLine();
        }

        System.out.println("Plants for the exhibition:");
        library
                .entrySet()
                .stream()
                .sorted((a, b) -> {
                    int dif = b.getValue() - a.getValue();
                    if (dif == 0) {
                        double first = rating.get(a.getKey()).stream()
                                .mapToDouble(Double::doubleValue)
                                .average()
                                .orElse(0);

                        double second = rating.get(b.getKey()).stream()
                                .mapToDouble(Double::doubleValue)
                                .average()
                                .orElse(0);
                        return Double.compare(second, first);
                    } else {
                        return dif;
                    }
                })
                .forEach(s -> System.out.println(String.format("- %s; Rarity: %d; Rating: %.2f", s.getKey(), s.getValue(), rating.get(s.getKey()).stream().
                        mapToDouble(Double::doubleValue)
                        .average()
                        .orElse(0))));
    }
}
