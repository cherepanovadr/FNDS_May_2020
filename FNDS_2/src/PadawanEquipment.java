import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amountOfMoney = Double.parseDouble(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());
        double lightsabersPrice = Double.parseDouble(scanner.nextLine());
        double robesPrice = Double.parseDouble(scanner.nextLine());
        double beltsPrice = Double.parseDouble(scanner.nextLine());
        double lightsabersTotalPrice = Math.ceil(1.1 * studentsCount) * lightsabersPrice;
        double robesTotalPrice = studentsCount * robesPrice;
        int freeBeltsCount = studentsCount / 6;
        double beltsTotalPrice = (studentsCount - freeBeltsCount) * beltsPrice;

        double finalPrice = lightsabersTotalPrice + beltsTotalPrice + robesTotalPrice;
        if (finalPrice > amountOfMoney) {
            double moneyNeed = finalPrice - amountOfMoney;
            System.out.printf("Ivan Cho will need %.2flv more.", moneyNeed);
        } else {
            System.out.printf("The money is enough - it would cost %.2flv.", finalPrice);
        }
    }
}