import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();
        String second = scanner.nextLine();

        int index = second.indexOf(first);

//ice
//kicegiciceeb
// kgb
        while (second.contains(first)) {
            second = second.replace(first, "");

        }
        System.out.println(second);

    }
}
