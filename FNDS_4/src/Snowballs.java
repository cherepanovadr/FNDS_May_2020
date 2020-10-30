import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ballsNumber = Integer.parseInt(scanner.nextLine());
        double highest = -1;
        int snowballSnow = 0;
        int snowballTime = 0;
        int snowballQuality = 0;
        int WsnowballSnow = 0;
        int WsnowballTime = 0;
        int WsnowballQuality = 0;

        for (int i = 0; i < ballsNumber; i++) {
            snowballSnow = Integer.parseInt(scanner.nextLine());
            snowballTime = Integer.parseInt(scanner.nextLine());
            snowballQuality = Integer.parseInt(scanner.nextLine());

            double snowballValue = Math.pow((snowballSnow / snowballTime), snowballQuality);
            if (snowballValue > highest) {
                highest = snowballValue;
                WsnowballSnow = snowballSnow;
                WsnowballTime = snowballTime;
                WsnowballQuality = snowballQuality;

            }
        }
        System.out.printf("%d : %d = %.0f (%d)", WsnowballSnow, WsnowballTime, highest, WsnowballQuality);

    }
}
