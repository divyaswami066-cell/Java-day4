
import java.util.TreeSet;

public class ExamScoreRanking {
    public static void main(String[] args) {

        // 1. Store unique exam scores
        TreeSet<Integer> scores = new TreeSet<>();

        scores.add(75);
        scores.add(90);
        scores.add(60);
        scores.add(85);
        scores.add(95);
        scores.add(70);
        scores.add(80);

        // 2. Scores are automatically sorted in ascending order

        // 3. Display all unique scores
        System.out.println("Exam Scores: " + scores);

        // 4. Find the highest and lowest scores
        System.out.println("Lowest Score: " + scores.first());
        System.out.println("Highest Score: " + scores.last());

        // 5. Find the score immediately higher than a given score
        int givenScore = 80;
        System.out.println("Next Higher Score: "
                + scores.higher(givenScore));

        // 6. Find the score immediately lower than a given score
        System.out.println("Next Lower Score: "
                + scores.lower(givenScore));

        // 7. Display scores in descending order
        System.out.println("Scores in Descending Order: "
                + scores.descendingSet());
    }
}
