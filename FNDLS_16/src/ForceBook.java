import java.util.*;

public class ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> db = new TreeMap<>();
        String toDeleteSide = "";
        String input = scanner.nextLine();
        while (!input.equals("Lumpawaroo")) {
            String user = "";
            String side = "";
            String[] parts = input.split(" \\| | -> ");
            if (input.contains("|")) {
                side = parts[0];
                user = parts[1];
                db.putIfAbsent(side, new ArrayList<>());
                if (!db.containsValue(user)) {
                    db.get(side).add(user);
                }
            } else if (input.contains("->")) {
                user = parts[0];
                boolean Da = false;
                side = parts[1];
                for (Map.Entry<String, List<String>> current : db.entrySet()) {
                    if (current.getValue().contains(user)) {
                        toDeleteSide = current.getKey();
                        Da = true;
                    }

                }
                if (Da) {
                    db.remove(toDeleteSide);
                    Da = false;
                }
                db.putIfAbsent(side, new ArrayList<>());
                db.get(side).add(user);
                System.out.printf("%s joins the %s side!\n", user, side);
            }
            input = scanner.nextLine();
        }
        db
                .entrySet()
                .stream()
                .sorted((a, b) -> {
                    int res = Integer.compare(b.getValue().size(), a.getValue().size());
                    if (res == 0) {
                        return a.getKey().compareTo(b.getKey());
                    } else {
                        return res;

                    }
                })
                .forEach(entry -> {
                    System.out.printf("Side: %s, Members: %d%n", entry.getKey(), entry.getValue().size());
                    entry.getValue()
                            .stream()
                            .sorted(String::compareTo)
                            .forEach(p -> System.out.println("! " + p));

                });
    }

}
