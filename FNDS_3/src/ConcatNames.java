import java.util.Scanner;

public class ConcatNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String Surname = scanner.nextLine();
        String third = scanner.nextLine();
        System.out.printf("%s%s%s",name,third,Surname);
        System.out.printf("%c",(char) 256);

    }
}
