import java.util.Scanner;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String big = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        int number = Integer.parseInt(scanner.nextLine());
        if (number == 0){
            System.out.println(0);
            return;
        }
        while (big.charAt(0) == '0'){
            big = big.substring(1);
        }
        int remainer = 0;
        for (int i = big.length() - 1; i >= 0; i--) {
            int digit = Integer.parseInt(String.valueOf(big.charAt(i)));
            int result = digit * number + remainer;
            remainer = 0;
            if (result > 9) {
                remainer = result / 10;  //2   25/10
                result = result % 10; //5

            }
            sb.append(result);

        }
        if(remainer!=0) {
            sb.append(remainer);

        }
        System.out.println(sb.reverse().toString());


    }
}
