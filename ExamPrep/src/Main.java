import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String encrypted = scanner.nextLine();
        String command = scanner.nextLine();

        while (!command.equals("Finish")) {
            String[] commandParts = command.split(" ");
            String commandName = commandParts[0];
            switch (commandName) {
                case "Replace":
                    encrypted = replaceCom(encrypted, commandParts[1].charAt(0), commandParts[2].charAt(0));
                    break;
                case "Cut":
                    int begin = Integer.parseInt(commandParts[1]);
                    int end = Integer.parseInt(commandParts[2]);
                    encrypted = cut(encrypted, begin, end);
                    break;
                case "Make":
                    encrypted = make(encrypted, commandParts[1]);
                    break;
                case "Check":
                    check(encrypted, commandParts[1]);
                    break;
                case "Sum":
                    int beginI = Integer.parseInt(commandParts[1]);
                    int endI = Integer.parseInt(commandParts[2]);
                    sumIndexes(encrypted, beginI, endI);
                    break;
            }
            command = scanner.nextLine();
        }
    }

    private static void sumIndexes(String encrypted, int beginI, int endI) {
        if (areValidIndexes(encrypted.length(), beginI, endI)) {
            int sum = 0;
            for (int i = beginI; i < endI + 1; i++) {
                sum += encrypted.charAt(i);
            }
            System.out.println(sum);
        }
    }

    private static void check(String encrypted, String searchFor) {
        if (encrypted.contains(searchFor)) {
            System.out.printf("Message contains %s%n", searchFor);
        } else {
            System.out.printf("Message doesn't contain %s%n", searchFor);
        }
    }

    private static String make(String encrypted, String targetCase) {
        if (targetCase.equals("Upper")) {
            encrypted = encrypted.toUpperCase();
        } else {
            encrypted = encrypted.toLowerCase();
        }
        System.out.println(encrypted);

        return encrypted;
    }

    private static String cut(String encrypted, int begin, int end) {
        int length = encrypted.length();
        if (areValidIndexes(encrypted.length(), begin, end)) {
            String firstPart = encrypted.substring(0, begin);
            String lastPart = encrypted.substring(end + 1, length);
            System.out.println(firstPart + lastPart);
            return firstPart + lastPart;
        }
        return encrypted;
    }

    private static boolean areValidIndexes(int length, int begin, int end) {
        if (begin >= 0 && begin < length && end >= 0 && end < length) {
            return true;
        } else {
            System.out.println("Invalid indexes!");
            return false;
        }
    }

    private static String replaceCom(String encrypted, char searchFor, char replaceWith) {
        encrypted = encrypted.replace(searchFor, replaceWith);
        System.out.println(encrypted);
        return encrypted;
    }

}
