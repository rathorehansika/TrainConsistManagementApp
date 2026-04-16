import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UseCase11TrainConsistMgmnt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // [cite: 21]

        System.out.println("=========================================");
        System.out.println("UC11 - Validate Train ID and Cargo Code");
        System.out.println("=========================================\n");

        // ---- Accept Input ---- [cite: 21, 24]
        System.out.print("Enter Train ID (Format: TRN-1234): ");
        String trainId = scanner.nextLine();

        System.out.print("Enter Cargo Code (Format: PET-AB): ");
        String cargoCode = scanner.nextLine();

        // ---- DEFINE REGEX RULES ---- [cite: 31, 37]
        // TRN- followed by exactly four digits [cite: 38, 53]
        String trainIdRegex = "TRN-\\d{4}"; 
        
        // PET- followed by exactly two uppercase letters [cite: 39, 54]
        String cargoCodeRegex = "PET-[A-Z]{2}"; 

        // ---- COMPILE PATTERNS ---- [cite: 25, 40]
        Pattern trainIdPattern = Pattern.compile(trainIdRegex);
        Pattern cargoCodePattern = Pattern.compile(cargoCodeRegex);

        // ---- CREATE MATCHERS AND VALIDATE ---- [cite: 26, 41]
        // matches() verifies the entire input string conforms exactly [cite: 34, 42, 57]
        Matcher trainIdMatcher = trainIdPattern.matcher(trainId);
        boolean isTrainIdValid = trainIdMatcher.matches();

        Matcher cargoCodeMatcher = cargoCodePattern.matcher(cargoCode);
        boolean isCargoCodeValid = cargoCodeMatcher.matches();

        // ---- DISPLAY RESULTS ---- [cite: 28, 43, 50]
        System.out.println("\nValidation Results:");
        System.out.println("Train ID Valid: " + isTrainIdValid);
        System.out.println("Cargo Code Valid: " + isCargoCodeValid);

        System.out.println("\nUC11 validation completed..."); // [cite: 50]
        
        scanner.close();
    }
}
