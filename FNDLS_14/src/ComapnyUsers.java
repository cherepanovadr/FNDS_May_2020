import java.util.*;

public class ComapnyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, List<String>> company = new LinkedHashMap<>();
//companyName and employee's id,
        while (!"end".equalsIgnoreCase(input)) {
            String[] data = input.split(" -> ");
            String companyName = data[0];
            String id = data[1];
            company.putIfAbsent(companyName, new ArrayList<>());
            List<String> ku = company.get(companyName);
            if (!ku.contains(id)) {
                ku.add(id);
            }

//company cannot have two employees with the same id.
            input = scanner.nextLine();
        }
        company
                .entrySet()
                .stream()
                .sorted((a1, a2) -> a1.getKey().compareTo(a2.getKey()))
                .forEach(entry -> {
                            System.out.println(String.format("%s", entry.getKey()));
                            entry
                                    .getValue()
                                    .stream()
                                    .forEach(s -> System.out.println(String.format("-- %s", s)));


                        }


                );

    }
}
