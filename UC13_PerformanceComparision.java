import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class UseCase13TrainConsistMgmnt {

    // Bogie model
    static class Bogie {
        String type;
        int capacity;

        Bogie(String type, int capacity) {
            this.type = type;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {
        System.out.println("=================================================");
        System.out.println(" UC13 - Performance Comparison (Loops vs Streams) ");
        System.out.println("=================================================\n");

        // Create large test dataset [cite: 183, 201]
        List<Bogie> bogies = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            bogies.add(new Bogie("Sleeper", (int) (Math.random() * 100)));
        }

        // ---- MEASURE LOOP EXECUTION TIME ----
        long loopStart = System.nanoTime(); // [cite: 184]
        List<Bogie> loopFiltered = new ArrayList<>();
        for (Bogie bogie : bogies) { // [cite: 178]
            if (bogie.capacity > 60) { // [cite: 197]
                loopFiltered.add(bogie);
            }
        }
        long loopEnd = System.nanoTime(); // [cite: 186]
        long loopDuration = loopEnd - loopStart; // [cite: 187]

        // ---- MEASURE STREAM EXECUTION TIME ----
        long streamStart = System.nanoTime(); // [cite: 184]
        List<Bogie> streamFiltered = bogies.stream() // [cite: 179]
                .filter(bogie -> bogie.capacity > 60) // [cite: 198]
                .collect(Collectors.toList());
        long streamEnd = System.nanoTime(); // [cite: 186]
        long streamDuration = streamEnd - streamStart; // [cite: 187]

        // ---- DISPLAY PERFORMANCE RESULTS ----
        System.out.println("Loop Execution Time (ns): " + loopDuration); // [cite: 188]
        System.out.println("Stream Execution Time (ns): " + streamDuration); // [cite: 188]
        
        // Verifying result consistency 
        System.out.println("\nResults match: " + (loopFiltered.size() == streamFiltered.size()));

        System.out.println("\nUC13 performance benchmarking completed...");
    }
}
