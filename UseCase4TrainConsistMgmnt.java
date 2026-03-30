import java.util.Set;
import java.util.TreeSet;


public class UseCase4TrainConsistMgmnt {

    public static void main(String[] args) {

        // Display Header
        System.out.println("==============================================");
        System.out.println(" UC4 - Maintain Ordered Bogie IDs ");
        System.out.println("==============================================\n");

        // Create a TreeSet to store unique and sorted bogie IDs
        // TreeSet implements SortedSet and maintains natural ordering
        Set<String> bogies = new TreeSet<>();

        // ---- ADD IDs (in random order) ----
        bogies.add("BG104");
        bogies.add("BG101");
        bogies.add("BG103");
        bogies.add("BG102");

        // Duplicate entries will still be ignored
        bogies.add("BG101"); 

        // Display the unique and sorted IDs
        System.out.println("Bogie IDs After Sorted Insertion:");
        System.out.println(bogies + "\n");

        System.out.println("Note:");
        System.out.println("TreeSet automatically sorts elements in natural order.");
        System.out.println("Duplicate 'BG101' was automatically ignored.\n");

        System.out.println("UC4 ordered validation completed successfully...");
    }
}