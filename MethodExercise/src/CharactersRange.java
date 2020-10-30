import java.util.Scanner;

public class CharactersRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char a = scanner.nextLine().charAt(0);
        char b = scanner.nextLine().charAt(0);
        if(a>b){
            printRange(b, a);

        } else {
            printRange(a, b);
        }
    }

    private static void printRange(char a, char b) {
        for (char i =  ++a; i < b; i++) {
            System.out.printf("%c ",i);

        }
    }
}
