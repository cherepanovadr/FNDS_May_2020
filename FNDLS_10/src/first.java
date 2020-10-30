import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] parts = scanner.nextLine().split("\\|");
        List<String> chest = new ArrayList<>();
        for (String part : parts) {
            chest.add(part);
        }
        String command = scanner.nextLine();
        while (!command.equals("Yohoho!")) {
            String[] array = command.split(" ");
            String action = array[0];
            switch (action) {
                case "Loot":
                    for (int i = 0; i < array.length; i++) {
                        if (!chest.contains(array[i])) {
                            chest.add(0, array[i]);
                        }
                    }
                    break;
                case "Drop":
                    int dropIndex = Integer.parseInt(array[1]);
                    if ((dropIndex < 0) || dropIndex >= chest.size()) {
                        break;
                    }
                    chest.add(chest.remove(dropIndex));

                    break;
                case "Steal":
                    int staelAmount = Integer.parseInt(array[1]);
                    List<String> stolem = new ArrayList<>();
                    String output = "";
                    if (staelAmount>= chest.size()){
                        output = String.join(", ", chest);
                        chest.clear();
                        break;
                    } else{
                    for (int i = 0; i < staelAmount; i++) {
                        int lastindex =chest.size()-1;
                        stolem.add(chest.remove(lastindex));
                    }
                    Collections.reverse(stolem);
                    output = String.join(", ",stolem);
                    System.out.println(output);
                    break;
            }}
            command = scanner.nextLine();
        }
        int total = 0;
        for (String s : chest) {
            total+= s.length();
        }
        if (total == 0){
            System.out.println("Failed treasure hunt.");

        } else {
            double av = total*1.00/chest.size();
            System.out.printf("Average treasure gain: %.2f pirate credits.", av);
                    }




    }
}
