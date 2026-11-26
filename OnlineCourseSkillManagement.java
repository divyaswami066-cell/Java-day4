
import java.util.TreeSet;

public class OnlineCourseSkillManagement {
    public static void main(String[] args) {

        // Create a TreeSet to store unique skills in alphabetical order
        TreeSet<String> skills = new TreeSet<>();

        // 1. Add technical skills
        skills.add("Java");
        skills.add("Python");
        skills.add("React");
        skills.add("SQL");
        skills.add("MongoDB");

        System.out.println("Online Course Skills: " + skills);

        // 2. Add a new skill
        skills.add("Angular");
        System.out.println("\nAfter adding Angular: " + skills);

        // 3. Prevent duplicate skills
        skills.add("Java");
        System.out.println("After adding duplicate Java: " + skills);

        // 4. Skills are automatically sorted alphabetically
        System.out.println("\nSkills in Alphabetical Order: " + skills);

        // 5. Remove a skill
        skills.remove("React");
        System.out.println("\nAfter removing React: " + skills);

        // 6. Search for a skill
        String searchSkill = "Python";

        if (skills.contains(searchSkill)) {
            System.out.println(searchSkill + " is available.");
        } else {
            System.out.println(searchSkill + " is not available.");
        }

        // 7. Display first and last skills
        System.out.println("\nFirst Skill: " + skills.first());
        System.out.println("Last Skill: " + skills.last());

        // 8. Display skills in descending order
        System.out.println("\nSkills in Descending Order: "
                + skills.descendingSet());
    }
}
