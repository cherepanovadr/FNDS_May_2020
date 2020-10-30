import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> members = new HashMap<>();
        Map<String, Integer> submissions = new HashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("exam finished")) {
//Pesho-Java-91
//Gosho-C#-84
//Kiro-Java-90
//Kiro-C#-50
//Kiro-banned
//exam finished
            String[] parts = input.split("-");
            String name = parts[0];
            String lang = parts[1];
            submissions.putIfAbsent(lang, 0);
            submissions.put(lang, submissions.get(lang) + 1);
            if (lang.equals("banned")) {
                members.remove(name);
            } else {
                int score = Integer.parseInt(parts[2]);
                members.putIfAbsent(name, 0);
                if(members.containsKey(name)){
                    if(members.get(name)<score){
                        members.put(name, score);
                    }
                }
            }
            input = scanner.nextLine();

        }
        submissions.remove("banned");
        System.out.println("Results:");
        members
                .entrySet()
                .stream()
                .sorted((a, b) -> {
                    int dif = Integer.compare(b.getValue(),a.getValue());
                    if (dif == 0) {
                        return a.getKey().compareTo(b.getKey());
                    } else{
                        return dif;
                    }})
                .forEach(s -> System.out.println(String.format("%s | %d", s.getKey(), s.getValue())));
        System.out.println("Submissions:");
        submissions
                .entrySet()
                .stream()
                .sorted((a, b) -> {
                    int dif = Integer.compare(b.getValue(),a.getValue());
                    if (dif == 0) {
                        return a.getKey().compareTo(b.getKey());
                    } else{
                    return dif;
                }})
                .forEach(s -> System.out.println(String.format("%s - %d", s.getKey(), s.getValue())));
    }
}
