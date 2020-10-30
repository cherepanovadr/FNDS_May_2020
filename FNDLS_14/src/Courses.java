import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // read "{courseName} : {studentName}" until end
        //Check if such course already exists, and if not - add the course.
        //end-> print ordered by the count of registered users in descending order. For each contest print registered users ordered by name in ascending order.
        Map<String, List<String>> courses = new LinkedHashMap<>();
        String input = scanner.nextLine();
        while (!"end".equalsIgnoreCase(input)) {
            String[] tokens = input.split("\\s+:");
            String courseName = tokens[0];
            String studentName = tokens[1];
            courses.putIfAbsent(courseName, new ArrayList<>());
            List<String> students = courses.get(courseName);
            students.add(studentName);

            input = scanner.nextLine();
        }
        courses
                .entrySet()
                .stream()
                .sorted((c1, c2) -> Integer.compare(c2.getValue().size(), c1.getValue().size()))
                .forEach(entry -> {
                    System.out.println(String.format("%s: %d", entry.getKey(), entry.getValue().size()));
                    entry
                            .getValue()
                            .stream()
                            .sorted((s1,s2) -> s1.compareTo(s2))
                            .forEach(s -> System.out.println(String.format("--%s",s)));
                });


    }
}
