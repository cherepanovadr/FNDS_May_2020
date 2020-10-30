import java.util.*;

public class studentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<Double>> academy = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String studentsName = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            academy.putIfAbsent(studentsName, new ArrayList<>());
            academy.get(studentsName).add(grade);

        }
        academy
                .entrySet()
                .stream()
                .filter(a -> a.getValue()
                        .stream()
                        .mapToDouble(Double::doubleValue)
                        .average()
                        .getAsDouble() >= 4.50)
                .sorted((s1, s2) -> {
                    double first = s1.getValue().stream().mapToDouble(Double::doubleValue).average().getAsDouble();
                    double second = s2.getValue().stream().mapToDouble(Double::doubleValue).average().getAsDouble();
                    return Double.compare(second, first);
                })
                .forEach(s -> System.out.println(String.format("%s -> %.2f", s.getKey(), s.getValue().stream().mapToDouble(Double::doubleValue).average().getAsDouble())));

    }
}
