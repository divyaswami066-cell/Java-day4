
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TAsk28 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Store each word and its frequency
        HashMap<String, Integer> wordCount = new HashMap<>();

        System.out.println("Enter a paragraph:");
        String paragraph = sc.nextLine();

        // Convert to lowercase and remove punctuation
        paragraph = paragraph.toLowerCase();
        paragraph = paragraph.replaceAll("[\\p{Punct}]", "");

        // Split paragraph into words
        String[] words = paragraph.trim().isEmpty()
                ? new String[0]
                : paragraph.trim().split("\\s+");

        // Count each word
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Display word frequencies
        System.out.println("\nWord Frequencies:");

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // Find the most frequent word
        if (wordCount.isEmpty()) {
            System.out.println("No words found.");
        } else {
            String mostFrequentWord = "";
            int highestFrequency = 0;

            for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
                if (entry.getValue() > highestFrequency) {
                    highestFrequency = entry.getValue();
                    mostFrequentWord = entry.getKey();
                }
            }

            System.out.println("\nMost Frequent Word: "
                    + mostFrequentWord);
            System.out.println("Frequency: " + highestFrequency);
        }

        // Display total unique words
        System.out.println("Unique Words: " + wordCount.size());

        sc.close();
    }
}
