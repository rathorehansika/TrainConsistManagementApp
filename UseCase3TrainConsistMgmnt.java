import java.util.HashSet;
import java.util.Set;


public class UseCase3TrainConsistMgmnt {

    public static void main(String[] args) {

        // Display Header
        System.out.println("==============================================");
        System.out.println(" UC3 - Track Unique Bogie IDs ");
        System.out.println("==============================================\n");

        // Create a Set to store unique bogie IDs
        // HashSet stores only unique values 
        Set<String> bogies = new HashSet<>();

        // ---- ADD IDs (including duplicates) ----
        // add() inserts bogie IDs into the set 
        bogies.add("BG101");
        bogies.add("BG102");
        bogies.add("BG103");
        bogies.add("BG104");

        // Duplicate entries will be ignored internally by HashSet 
        bogies.add("BG101"); // Duplicate entry
        bogies.add("BG102"); // Duplicate entry

        // Display the unique IDs
        System.out.println("Bogie IDs After Insertion:");
        System.out.println(bogies + "\n");

        System.out.println("Note:");
        System.out.println("Duplicates are automatically ignored by HashSet.\n");

        System.out.println("UC3 uniqueness validation completed...");
    }
}