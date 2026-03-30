import java.util.HashMap;
import java.util.Map;


public class UseCase6TrainConsistMgmnt {

    public static void main(String[] args) {

        // Display Header
        System.out.println("==============================================");
        System.out.println("   UC6 - Map Bogie to Capacity (HashMap) ");
        System.out.println("==============================================\n");

        // Create a HashMap to store bogie names (String) and capacities (Integer)
        // Key = Bogie Name, Value = Capacity
        Map<String, Integer> bogieCapacityMap = new HashMap<>();

        // ---- INSERT DATA (Key-Value Pairs) ----
        // put() binds the bogie name to its capacity 
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 56);
        bogieCapacityMap.put("First Class", 24);
        bogieCapacityMap.put("Cargo", 5000); // 5000kg load capacity

        // ---- ITERATION AND DISPLAY ----
        System.out.println("Bogie Capacity Details:");
        
        // entrySet() allows us to iterate over both keys and values together 
        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println("Bogie Type: " + entry.getKey() + " | Capacity: " + entry.getValue());
        }

        // ---- FAST LOOKUP EXAMPLE ----
        String searchBogie = "AC Chair";
        if (bogieCapacityMap.containsKey(searchBogie)) {
            System.out.println("\nQuick Lookup: " + searchBogie + " has a capacity of " + 
                               bogieCapacityMap.get(searchBogie) + " units.");
        }

        System.out.println("\nUC6 capacity mapping completed successfully...");
    }
}