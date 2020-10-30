import java.util.Scanner;

public class SecretChat_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//heVVodar!gniV
//ChangeAll:|:V:|:l
//Reverse:|:!gnil
//InsertSpace:|:5
//Reveal
        StringBuilder sb = new StringBuilder();
        String input = scanner.nextLine();
        sb.append(input);
        String command = scanner.nextLine();
        while (!command.equals("Reveal")) {
            String[] commandParts = command.split(":\\|:");
            String action = commandParts[0];
            switch (action) {
                case "InsertSpace":
                    int index = Integer.parseInt(commandParts[1]);
                    sb.insert(index, " ");
                    System.out.println(sb.toString());
                    break;
                case "Reverse":
                    String part = commandParts[1];
                    StringBuilder partReverse = new StringBuilder();
                    partReverse.append(part);
                    int begin = sb.indexOf(part);
                    if (begin == -1) {
                        System.out.println("error");
                    } else {
                        sb.delete(begin, begin + part.length());
                        partReverse.reverse();
                        sb.append(partReverse);

                        System.out.println(sb.toString());
                    }
                    break;
                case "ChangeAll":
                    String toChange = commandParts[1];
                    String changeWith = commandParts[2];
                    while (sb.indexOf(toChange) != -1) {
                        int current = sb.indexOf(toChange);
                        sb.replace(current, current+toChange.length(), changeWith);
                        current = sb.indexOf(toChange, current+1);
                    }
                    System.out.println(sb.toString());
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.printf("You have a new text message: %s ", sb.toString());
    }
}
