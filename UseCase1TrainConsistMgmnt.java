import java.util.ArrayList;
import java.util.List;


public class UseCase1TrainConsistMgmnt {

    public static void main(String[] args) {
        
        // Display welcome banner [cite: 12, 33]
        System.out.println("==============================================");
        System.out.println(" === Train Consist Management App === ");
        System.out.println("==============================================\n");

        // Create a dynamic list to store train bogies [cite: 12, 34]
        // ArrayList is used because its size can grow at runtime [cite: 25, 26]
        List<String> trainConsist = new ArrayList<>();

        // Display initial consist information [cite: 12]
        System.out.println("Train initialized successfully...");
        
        // Display the initial bogie count using size() [cite: 18, 35]
        System.out.println("Initial Bogie Count : " + trainConsist.size());
        
        // Prints the current state of the train (empty list) [cite: 11, 41]
        System.out.println("Current Train Consist : " + trainConsist);
        
        System.out.println("\nSystem ready for operations..."); 
    }
}