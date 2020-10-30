import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int power = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustinFactor  = Integer.parseInt(scanner.nextLine());
        int currentPokerPower=power;
        int targetsCount = 0;
        while (currentPokerPower>=distance){
            currentPokerPower-=distance;
            targetsCount++;
            if ((currentPokerPower == power/2.0)&& exhaustinFactor!=0) {
                currentPokerPower = currentPokerPower/exhaustinFactor;

            }
        }
        System.out.println(currentPokerPower);
        System.out.println(targetsCount);


    }
}
