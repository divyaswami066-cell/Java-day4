
import java.util.TreeMap;
import java.util.Map;

public class OnlineExaminationResultSystem {
    public static void main(String[] args) {

        // 1. Store roll numbers as keys and marks as values
        TreeMap<Integer, Integer> results = new TreeMap<>();

        results.put(105, 85);
        results.put(102, 92);
        results.put(108, 76);
        results.put(101, 68);
        results.put(106, 95);

        // 2. TreeMap automatically sorts roll numbers

        // 3. Add a new result
        results.put(103, 88);

        // Update an existing result
        results.put(105, 90);

        // 4. Display all student results
        System.out.println("All Student Results:");
        for (Map.Entry<Integer, Integer> entry : results.entrySet()) {
            System.out.println("Roll No: " + entry.getKey()
                    + ", Marks: " + entry.getValue());
        }

        // 5. Find highest and lowest marks
        int highestMarks = Integer.MIN_VALUE;
        int lowestMarks = Integer.MAX_VALUE;
        int highestRollNo = 0;
        int lowestRollNo = 0;

        for (Map.Entry<Integer, Integer> entry : results.entrySet()) {
            int marks = entry.getValue();

            if (marks > highestMarks) {
                highestMarks = marks;
                highestRollNo = entry.getKey();
            }

            if (marks < lowestMarks) {
                lowestMarks = marks;
                lowestRollNo = entry.getKey();
            }
        }

        System.out.println("\nHighest Marks: " + highestMarks
                + " (Roll No: " + highestRollNo + ")");
        System.out.println("Lowest Marks: " + lowestMarks
                + " (Roll No: " + lowestRollNo + ")");

        // 6. Display results within roll number range 102 to 106
        System.out.println("\nResults for Roll Numbers 102 to 106:");
        for (Map.Entry<Integer, Integer> entry :
                results.subMap(102, true, 106, true).entrySet()) {
            System.out.println("Roll No: " + entry.getKey()
                    + ", Marks: " + entry.getValue());
        }

        // 7. Display results in reverse roll number order
        System.out.println("\nResults in Reverse Roll Number Order:");
        for (Map.Entry<Integer, Integer> entry :
                results.descendingMap().entrySet()) {
            System.out.println("Roll No: " + entry.getKey()
                    + ", Marks: " + entry.getValue());
        }

        // Display first and last entries
        System.out.println("\nFirst Entry: " + results.firstEntry());
        System.out.println("Last Entry: " + results.lastEntry());

        // Search marks using roll number
        System.out.println("Marks of Roll No 103: " + results.get(103));
    }
}
