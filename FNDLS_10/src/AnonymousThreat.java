import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] parts = scanner.nextLine().split(" ");
        List<String> array = new ArrayList<>();
        for (String part : parts) {
            array.add(part);
        }
//commands and implement them until 3-1
        String command = scanner.nextLine();
        while (!command.equalsIgnoreCase("3:1")) {
            String[] input = command.split(" ");
            String action = input[0];
            switch (action) {
                case "merge":
                    int startIndex = Integer.parseInt(input[1]);
                    int endIndex = Integer.parseInt(input[2]);
                    if (startIndex < 0) {
                        startIndex = 0;
                    } else if (startIndex > array.size() - 1) {
                        break;
                    }
                    if (endIndex > array.size() - 1) {
                        endIndex = array.size() - 1;
                    }
                    int count = 0;
                    for (int i = startIndex; count < endIndex - startIndex; i++) {
                        String temp = "";
                        temp = array.get(i) + array.get(i + 1);
                        array.set(i, temp);
                        array.remove(i + 1);
                        count++;
                        i = startIndex - 1;
                    }
                    break;
                case "divide":
                    int index = Integer.parseInt(input[1]);
                    int partitions = Integer.parseInt(input[2]);
                    List<String> intList = new ArrayList<>();
                    String[] temm = array.get(index).split("");
                    for (String s : temm) {
                        intList.add(s);
                    }
                    for (int i = 0; i < intList.size()/; i++) {

                    }





                    break;
            }

            command = scanner.nextLine();
        }


        for (String s : array) {
            System.out.print(s + " ");

        }

    }


}


