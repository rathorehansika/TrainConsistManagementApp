import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Bogie {
    String type;
    int capacity;

    public Bogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return String.format("Bogie{Type='%s', Capacity=%d}", type, capacity);
    }
}


public class UseCase9TrainConsistMgmnt {

    public static void main(String[] args) {

        // Display Header
        System.out.println("==============================================");
        System.out.println("   UC9 - Group Bogies by Type ");
        System.out.println("==============================================\n");

        // Initialize the list with multiple bogies of the same type
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));

        System.out.println("Original Flat List of Bogies:");
        bogies.forEach(System.out::println);

        // ---- STREAM GROUPING ----
        // groupingBy() organizes elements into a Map<String, List<Bogie>>
        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(Bogie::getType));

        // ---- DISPLAY GROUPED RESULTS ----
        System.out.println("\nGrouped Bogies Report:");
        groupedBogies.forEach((type, list) -> {
            System.out.println("Category: [" + type + "] -> Count: " + list.size());
            list.forEach(b -> System.out.println("   " + b));
        });

        System.out.println("\nUC9 categorization completed successfully...");
    }
}