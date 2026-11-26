
import java.util.LinkedList;

public class MusicPlaylistManagement {
    public static void main(String[] args) {

        // Create a playlist
        LinkedList<String> playlist = new LinkedList<>();

        // 1. Add songs to the playlist
        playlist.add("Perfect");
        playlist.add("Shape of You");
        playlist.add("Believer");

        // 2. Add a song at the beginning and end
        playlist.addFirst("Kesariya");
        playlist.addLast("Memories");

        // 3. Remove the first and last songs
        playlist.removeFirst();
        playlist.removeLast();

        // 4. Display the current playlist
        System.out.println("Current Playlist: " + playlist);

        // 5. Display the first and last songs
        System.out.println("First Song: " + playlist.getFirst());
        System.out.println("Last Song: " + playlist.getLast());

        // 6. Search for a particular song
        if (playlist.contains("Believer")) {
            System.out.println("Believer is in the playlist.");
        } else {
            System.out.println("Believer is not in the playlist.");
        }

        // 7. Play the current song by removing it
        if (!playlist.isEmpty()) {
            String currentSong = playlist.removeFirst();
            System.out.println("Playing Song: " + currentSong);
        }

        // Display playlist after playing
        System.out.println("Playlist after playing: " + playlist);
    }
}
