import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] bandWords = scanner.nextLine().split(", ");

        String text = scanner.nextLine();
        for (String bandWord : bandWords) {
            text = text.replace(bandWord, repeat("*", bandWord.length()));
        }
        System.out.println(text);
    }

    private static String repeat(String s, int number) {
        String[] repeated = new String[number];
        for (int i = 0; i <repeated.length ; i++) {
            repeated[i] = s;
        }
        return String.join("",repeated);
    }

}
