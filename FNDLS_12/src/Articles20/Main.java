package Articles20;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d = Integer.parseInt(scanner.nextLine());
        List<Article> library = new ArrayList<>();
        for (int i = 0; i < d; i++) {
            String[] tokens = scanner.nextLine().split(", ");
            String title = tokens[0];
            String content = tokens[1];
            String author = tokens[2];
            Article article = new Article(title, content, author);
            library.add(article);
        }
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("title")) {
            library
                    .stream()
                    .sorted((a1, a2) -> a1.getTitle().compareTo(a2.getTitle()))
                    .forEach(a -> System.out.println(a));
        } else if (input.equalsIgnoreCase("content")) {
            library
                    .stream()
                    .sorted((a1, a2) -> a1.getContent().compareTo(a2.getContent()))
                    .forEach(a -> System.out.println(a));
        }else if (input.equalsIgnoreCase("author")) {
            library
                    .stream()
                    .sorted((a1, a2) -> a1.getAuthor().compareTo(a2.getAuthor()))
                    .forEach(a -> System.out.println(a));
        }


    }


}
