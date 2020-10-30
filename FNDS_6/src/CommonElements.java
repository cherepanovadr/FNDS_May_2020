import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] first = scanner.nextLine().split(" ");
        String[] second = scanner.nextLine().split(" ");

        for (String elementOne : second) {
            for (String elementTwo : first) {
                if (elementOne.equals(elementTwo))
                {
                    System.out.print(elementOne+" ");
                }
            }

        }


    }
}
