import java.util.ArrayList;
import java.util.List;


public class UseCase2TrainConsistMgmnt {

    public static void main(String[] args) {

        // Display Header [cite: 60]
        System.out.println("==============================================");
        System.out.println(" UC2 - Add Passenger Bogies to Train ");
        System.out.println("==============================================\n");

        // Create an ArrayList to hold passenger bogies [cite: 60, 77]
        List<String> passengerBogies = new ArrayList<>();

        // ---- CREATE (Add bogies) ----
        // add() attaches a new bogie to the train [cite: 60, 71]
        passengerBogies.add("Sleeper"); 
        passengerBogies.add("AC Chair"); 
        passengerBogies.add("First Class"); 

        System.out.println("After Adding Bogies:");
        System.out.println("Passenger Bogies : " + passengerBogies + "\n"); 

        // ---- DELETE (Remove bogies) ----
        // remove() deletes elements from the list [cite: 72]
        passengerBogies.remove("AC Chair"); 
        System.out.println("After Removing 'AC Chair':");
        System.out.println("Passenger Bogies : " + passengerBogies + "\n");

        // ---- READ (Check existence) ----
        // contains() checks whether a given element exists in the list [cite: 73]
        System.out.println("Checking if 'Sleeper' exists:");
        boolean hasSleeper = passengerBogies.contains("Sleeper"); 
        System.out.println("Contains Sleeper? : " + hasSleeper + "\n");

        // Display Final State [cite: 82]
        System.out.println("Final Train Passenger Consist:");
        System.out.println(passengerBogies + "\n");

        System.out.println("UC2 operations completed successfully...");
    }
}