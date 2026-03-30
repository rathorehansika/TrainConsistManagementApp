import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * =====================================================================
 * HELPER CLASS - Bogie (Reused from UC7)
 * =====================================================================
 */
class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return String.format("Bogie{Name='%s', Capacity=%d}", name, capacity);
    }
}


public class UseCase8TrainConsistMgmnt {

    public static void main(String[] args) {

        // Display Header
        System.out.println("==============================================");
        System.out.println("   UC8 - Filter Bogies Using Streams ");
        System.out.println("==============================================\n");

        // Initialize the list of bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));

        System.out.println("Original Train Consist:");
        bogies.forEach(System.out::println);

        // ---- STREAM PIPELINE ----
        // 1. stream(): Converts the list into a stream of objects
        // 2. filter(): Retains only those that match the predicate (capacity > 60)
        // 3. collect(): Gathers the results back into a new List
        int threshold = 60;
        List<Bogie> highCapacityBogies = bogies.stream()
                .filter(b -> b.capacity > threshold)
                .collect(Collectors.toList());

        // Display results
        System.out.println("\nFiltered Bogies (Capacity > " + threshold + "):");
        if (highCapacityBogies.isEmpty()) {
            System.out.println("No bogies found matching the criteria.");
        } else {
            highCapacityBogies.forEach(System.out::println);
        }

        System.out.println("\nUC8 stream filtering completed successfully...");
    }
}