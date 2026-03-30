import java.util.ArrayList;
import java.util.List;

/**
 * =====================================================================
 * HELPER CLASS - Bogie (Reused from previous UCs)
 * =====================================================================
 */
class Bogie {
    String type;
    int capacity;

    public Bogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return String.format("Bogie{Type='%s', Capacity=%d}", type, capacity);
    }
}


public class UseCase10TrainConsistMgmnt {

    public static void main(String[] args) {

        // Display Header
        System.out.println("==============================================");
        System.out.println("   UC10 - Count Total Seats (Reduce) ");
        System.out.println("==============================================\n");

        // Initialize the list of bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));

        System.out.println("Current Train Consist:");
        bogies.forEach(System.out::println);

        // ---- STREAM AGGREGATION (MAP-REDUCE) ----
        // 1. stream(): Starts the process.
        // 2. map(Bogie::getCapacity): Extracts only the capacity numbers (72, 72, 56, 24).
        // 3. reduce(0, Integer::sum): Starts with 0 and adds every capacity to the running total.
        int totalSeats = bogies.stream()
                .map(Bogie::getCapacity)
                .reduce(0, Integer::sum);

        // ---- DISPLAY AGGREGATED RESULT ----
        System.out.println("\n--- Operational Summary ---");
        System.out.println("Total Bogies Attached  : " + bogies.size());
        System.out.println("Total Seating Capacity : " + totalSeats + " seats");

        System.out.println("\nUC10 aggregation completed successfully...");
    }
}