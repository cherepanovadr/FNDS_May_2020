import java.util.*;

public class InboxManager_3_Maps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, List<String>> registration = new HashMap<>();
        int count = 0;

        while (!input.equals("Statistics")) {
            String[] tokens = input.split("->");
            //•	"Add->{username}":
            //o	Check if the username exists and if it does print:
            //"{username} is already registered"
            // If it doesn’t exist, then add the user to the collection of users.
            //•	"Send->{username}->{Email}"
            //o	Add the {Email} to the {username}'s collection of sent Emails.
            //•	"Delete->{username}":
            //o	Delete the given user, if he exists. If the user doesn’t exist, print:
            //"{username} not found!
            String command = tokens[0];
            String username = tokens[1];
            switch (command) {
                case "Add":
                    if (registration.containsKey(username)) {
                        System.out.println(String.format("%s is already registered", username));
                    } else {
                        registration.put(username, new ArrayList<>());
                        count++;
                    }
                    break;
                case "Send":
                    String email = tokens[2];
                    registration.get(username).add(email);
                    break;
                case "Delete":
                    if (registration.containsKey(username)) {
                        registration.remove(username);
                        count--;
                    } else {
                        System.out.println(String.format("%s not found!", username));
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println(String.format("Users count: %d", count));
//print the count of users, each user with his/her Emails. Users need to be sorted in descending order by the count of sent Emails and then by their username in ascending order in the following format:
//Users count: {count}
//{username}
// - {Email1}
// - {Email2}
// - {Emailn}
        registration
                .entrySet()
                .stream()
                .sorted((left, right) -> {
                    int res = Integer.compare(right.getValue().size(), left.getValue().size());
                    if (res == 0) {
                        return left.getKey().compareTo(right.getKey());
                    } else {
                        return res;
                    }
                })
                .forEach(entry -> {
                            System.out.println(String.format("%s", entry.getKey()));

                            entry
                                    .getValue()
                                    .stream()
                                    .forEach(s -> System.out.println(String.format("- %s", s)));
                        }

                );

    }
}
