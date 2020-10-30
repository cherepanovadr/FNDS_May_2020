import java.util.*;

public class Meals_3_Maps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, List<String>> likedMeals = new LinkedHashMap<>();
        int unlinkedMeals = 0;
        while (!input.equals("Stop")) {
            String[] split = input.split("-");
            String type = split[0];
            String guestName = split[1];
            String mealName = split[2];

            if (type.equals("Like")) {
                likedMeals.putIfAbsent(guestName, new ArrayList<>());

                List<String> guestMeal = likedMeals.get(guestName);

                if (!guestMeal.contains(mealName)) {
                    guestMeal.add(mealName);
                }
                likedMeals.put(guestName, guestMeal);

            } else {
                if (!likedMeals.containsKey(guestName)) {
                    System.out.printf("%s is not at the party.\n", guestName);
                } else {
                    List<String> meals = likedMeals.get(guestName);
                    if (!meals.contains(mealName)) {
                        System.out.printf("%s doesn't have the %s in his/her collection.\n", guestName, mealName);
                    } else {
                        unlinkedMeals++;
                        System.out.printf("%s doesn't like the %s.\n", guestName, mealName);
                        meals.remove(mealName);
                        likedMeals.put(guestName, meals);
                    }
                }

            }
            input = scanner.nextLine();
        }
        likedMeals
                .entrySet()
                .stream()
                .sorted((left, right) -> {
                    int res = right.getValue().size() - left.getValue().size();
                    if(res ==0 ) {
                        return left.getKey().compareTo(right.getKey());
                    }else {
                        return res;
                    }

                })
                .forEach(e -> System.out.println(e.getKey()+ ": "+ printlist(e.getValue())));

        System.out.println("Unliked meals: " + unlinkedMeals);

    }

    private static String printlist(List<String> value) {
        return value.toString().replaceAll("[\\[\\]]", "");
    }
}
