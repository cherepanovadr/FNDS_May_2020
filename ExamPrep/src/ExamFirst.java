import java.util.Scanner;

public class ExamFirst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(scanner.nextLine());
//Hawai::Cyprys-Greece
        String commands = scanner.nextLine();
        while (!commands.equals("Travel")) {
//•	Add Stop:{index}:{string} – insert the given string at that index only if the index is valid
//•	Remove Stop:{start_index}:{end_index} – remove the elements of the string from the starting index to the end index (inclusive) if both indices are valid
//•	Switch:{old_string}:{new_string} – if the old string is in the initial string, replace it with the new one. (all occurrences)
            String[] tokens = commands.split(":");
            String action = tokens[0];
            switch (action) {
                case "Add Stop":
                    int indexAdd = Integer.parseInt(tokens[1]);
                    String cityAdd = tokens[2];
                    if (indexAdd >= 0 && indexAdd <= sb.length()) {
                        sb.insert(indexAdd, cityAdd);

                    }
                    System.out.println(sb.toString());
                    break;
                case "Remove Stop":
                    int startRemove = Integer.parseInt(tokens[1]);
                    int endRemove = Integer.parseInt(tokens[2]);
                    if (startRemove >= 0 && startRemove < sb.length() && endRemove >= 0 && endRemove <= sb.length()-1) {
                        sb.replace(startRemove, endRemove + 1, "");
                    }
                    System.out.println(sb.toString());

                    break;
                case "Switch":
                    String oldString = tokens[1];
                    String newString = tokens[2];
                    String check = sb.toString();
                    if (!oldString.equals(newString)) {
                        if (check.contains(oldString)) {
                            check = check.replace(oldString, newString);
                            sb.setLength(0);
                            sb.append(check);
                            check = "";
                        }
                    }


                    /*if(!oldString.equals(newString)) {
                        while (sb.indexOf(oldString) != -1) {
                            int current = sb.indexOf(oldString);
                            sb.replace(current, oldString.length() + current, newString);
                        }
                 }*/
                    System.out.println(sb.toString());
                    break;
            }
            commands = scanner.nextLine();
        }
        System.out.println("Ready for world tour! Planned stops: " + sb.toString());

    }
}
