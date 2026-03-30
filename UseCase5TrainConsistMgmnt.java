import java.util.LinkedHashSet;
import java.util.Set;


public class UseCase5TrainConsistMgmnt {

    public static void main(String[] args) {

        // Display Header
        System.out.println("==============================================");
        System.out.println(" UC5 - Preserve Insertion Order of Bogies ");
        System.out.println("==============================================\n");

        // Create a LinkedHashSet to store unique bogies while preserving order
        Set<String> trainFormation = new LinkedHashSet<>();

        // ---- ATTACH BOGIES (Insertion Order) ----
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt to attach a duplicate bogie
        // LinkedHashSet will ignore this to prevent invalid duplicates
        trainFormation.add("Sleeper"); 

        // Display the final formation
        System.out.println("Current Train Formation (Insertion Order):");
        System.out.println(trainFormation + "\n");

        System.out.println("Note:");
        System.out.println("LinkedHashSet preserved the 'Engine -> Sleeper -> Cargo -> Guard' sequence.");
        System.out.println("The duplicate 'Sleeper' was automatically blocked.\n");

        System.out.println("UC5 formation logic completed successfully...");
    }
}