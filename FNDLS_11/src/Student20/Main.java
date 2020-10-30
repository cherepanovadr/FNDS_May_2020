package Student20;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Student20> studentList = new ArrayList<>();
        while (!input.equalsIgnoreCase("end")) {
            String[] parts = input.split(" ");
            String firstName = parts[0];
            String lastName = parts[1];
            int age = Integer.parseInt(parts[2]);
            String city = parts[3];
            if (IsStudentExisting(studentList,firstName,lastName)) {
                Student20 student = getStudent20(studentList,firstName, lastName);
                student.setFirstName(firstName);
                student.setLastName(lastName);
                student.setAge(age);
                student.setCity(city);

            } else {
                Student20 student = new Student20(firstName, lastName, age, city);
                studentList.add(student);

            }
            input = scanner.nextLine();
        }
        String cityInput = scanner.nextLine();
        for (Student20 student20 : studentList) {
            if (cityInput.equalsIgnoreCase(student20.getCity())){
                System.out.printf("%s %s is %d years old%n", student20.getFirstName(),student20.getLastName(), student20.getAge());

            }

        }

    }

    private static Student20 getStudent20(List<Student20> studentList, String firstName, String lastName) {
        Student20 existingStudent = null;
        for (Student20 student20 : studentList) {
            if(student20.getFirstName().equalsIgnoreCase(firstName)&& (student20.getLastName().equalsIgnoreCase(lastName))) {
                existingStudent=student20;
            }
        }
        return existingStudent;
    }

    private static boolean IsStudentExisting(List<Student20> studentList, String firstName, String lastName) {
        for (Student20 student20: studentList) {
            if (firstName.equalsIgnoreCase(student20.getFirstName()) && lastName.equalsIgnoreCase(student20.getLastName())){
                return true;
            }

        }
        return false;
    }
}
