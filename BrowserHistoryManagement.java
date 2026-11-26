
import java.util.LinkedList;

public class BrowserHistoryManagement {
    public static void main(String[] args) {

        // 1. Store visited website URLs
        LinkedList<String> history = new LinkedList<>();

        history.add("https://www.google.com");
        history.add("https://www.youtube.com");
        history.add("https://www.wikipedia.org");

        // 2. Add a newly visited website
        history.add("https://www.github.com");

        // 3. Display browsing history
        System.out.println("Browsing History: " + history);

        // 4. Remove the most recently visited website
        history.removeLast();
        System.out.println("After removing last website: " + history);

        // 5. Display the first and last visited websites
        System.out.println("First Visited: " + history.getFirst());
        System.out.println("Last Visited: " + history.getLast());

        // 6. Search whether a website was visited
        if (history.contains("https://www.youtube.com")) {
            System.out.println("YouTube was visited.");
        } else {
            System.out.println("YouTube was not visited.");
        }

        // 7. Clear browsing history
        history.clear();

        System.out.println("History after clearing: " + history);
        System.out.println("Total websites in history: " + history.size());
    }
}
