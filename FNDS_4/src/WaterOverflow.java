import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int linesNum = Integer.parseInt(scanner.nextLine());
        int volume = 0;
        for (int i = 0; i < linesNum; i++) {
            int addition = Integer.parseInt(scanner.nextLine());

            if (volume + addition > 255) {
                System.out.println("Insufficient capacity!");
            } else {
                volume = volume + addition;
            }

        }
        System.out.println(volume);

    }
}
