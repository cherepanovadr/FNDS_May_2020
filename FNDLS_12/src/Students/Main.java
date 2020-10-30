package Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        List<Student> course = new ArrayList<>();
        for (int i = 0; i <a ; i++) {
            String[] tokens = scanner.nextLine().split(" ");
            String firstName= tokens[0];
            String secondName= tokens[1];
            double grade = Double.parseDouble(tokens[2]);
            Student student = new Student(firstName,secondName,grade);
            course.add(student);


        }
course
        .stream()
        .sorted((s2,s1) -> Double.compare(s1.getGrade(),s2.getGrade()))
        .forEach(s -> System.out.println(s));



    }
}
