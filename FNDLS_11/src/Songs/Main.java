package Songs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Playlist> playlists = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] parts = scanner.nextLine().split("_");
            String type = parts[0];
            String name = parts[1];
            String time = parts[2];
            Playlist playlist = new Playlist(type, name, time);
            playlists.add(playlist);
        }
        String input = scanner.nextLine();
        for (Playlist playlist : playlists) {
            if (input.equalsIgnoreCase(playlist.getType())) {
                System.out.printf("%s%n", playlist.getName());

            } else if(input.equalsIgnoreCase("all")){
                System.out.println(playlist.getName());
            }


        }

    }

}
