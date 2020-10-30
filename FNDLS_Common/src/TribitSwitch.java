import java.util.Scanner;

public class TribitSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int p = Integer.parseInt(scanner.nextLine());
        for (int j = 0; j < 3; j++) {
            int bitOld = (number >> p) & 1;
            if (bitOld==1){
                number = number & ~(1 << p);
            }else{
                number = number |(1 << p);
            }
            p+=1;
        }
        System.out.println(number);


    }
}
//100 1101 0010
//100 0101 0010
//101 0101 0010
//111 0101 0010