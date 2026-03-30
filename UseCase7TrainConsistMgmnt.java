import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * =====================================================================
 * HELPER CLASS - Bogie
 * =====================================================================
 */
class Bogie {
    String name;
    int capacity;

    // Constructor to initialize bogie details
    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Overriding toString to display bogie information cleanly
    @Override
    public String toString() {
        return "Bogie{Name='" + name + "', Capacity=" + capacity + "}";
    }
}

/**
 * =====================================================================
 * MAIN CLASS - UseCase7TrainConsistMgmnt
 * =====================================================================
 * Use Case 7: Sort Bogies by Capacity (Comparator)
 * * Description:
 * This class demonstrates sorting custom objects using a Comparator.
 * * At this stage, the application:
 * - Uses a custom Bogie class
 * - Stores objects in a List
 * - Sorts them dynamically based on the 'capacity' field
 */
public class UseCase7TrainConsistMgmnt {

    public static void main(String[] args) {

        // Display Header
        System.out.println("==============================================");
        System.out.println("   UC7 - Sort Bogies by Capacity ");
        System.out.println("==============================================\n");

        // Create a List of Bogie objects
        List<Bogie> bogieList = new ArrayList<>();

        // ---- ADD BOGIE OBJECTS ----
        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 56));
        bogieList.add(new Bogie("First Class", 24));

        System.out.println("Before Sorting (Insertion Order):");
        bogieList.forEach(System.out::println);

        // ---- SORTING USING COMPARATOR ----
        // comparingInt() creates a comparator based on the capacity field
        bogieList.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("\nAfter Sorting (By Capacity - Low to High):");
        bogieList.forEach(System.out::println);

        // Bonus: Sort High to Low
        bogieList.sort(Comparator.comparingInt((Bogie b) -> b.capacity).reversed());
        
        System.out.println("\nAfter Sorting (By Capacity - High to Low):");
        bogieList.forEach(System.out::println);

        System.out.println("\nUC7 custom sorting completed successfully...");
    }
}