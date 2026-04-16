import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class UseCase11TrainConsistMgmnt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=========================================");
        System.out.println("UC11 - Validate Train ID and Cargo Code");
        System.out.println("=========================================\n");

        // ---- ACCEPT INPUT ---- [cite: 21, 24]
        System.out.print("Enter Train ID (Format: TRN-1234): ");
        String trainId = scanner.nextLine();

        System.out.print("Enter Cargo Code (Format: PET-AB): ");
        String cargoCode = scanner.nextLine();

        // ---- DEFINE REGEX RULES ---- [cite: 38, 39]
        // TRN- followed by exactly four digits
        String trainIdRegex = "TRN-\\d{4}"; 
        // PET- followed by exactly two uppercase letters
        String cargoCodeRegex = "PET-[A-Z]{2}"; 

        // ---- COMPILE PATTERNS ---- [cite: 25, 40]
        Pattern trainIdPattern = Pattern.compile(trainIdRegex);
        Pattern cargoCodePattern = Pattern.compile(cargoCodeRegex);

        // ---- CREATE MATCHERS AND VALIDATE ---- [cite: 26, 41, 42]
        Matcher trainIdMatcher = trainIdPattern.matcher(trainId);
        Matcher cargoCodeMatcher = cargoCodePattern.matcher(cargoCode);

        // matches() checks if the entire input matches the pattern [cite: 34, 57]
        boolean isTrainIdValid = trainIdMatcher.matches();
        boolean isCargoCodeValid = cargoCodeMatcher.matches();

        // ---- DISPLAY VALIDATION RESULTS ---- [cite: 43, 50]
        System.out.println("\nValidation Results:");
        System.out.println("Train ID Valid: " + isTrainIdValid);
        System.out.println("Cargo Code Valid: " + isCargoCodeValid);

        System.out.println("\nUC11 validation completed...");
        
        scanner.close();
    }
}
