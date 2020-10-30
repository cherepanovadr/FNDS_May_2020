import java.util.Scanner;

public class firstBit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String binaryString = Integer.toBinaryString((1<<5));
        String a = Integer.toBinaryString(~1);
        System.out.println(binaryString);
    }
}
