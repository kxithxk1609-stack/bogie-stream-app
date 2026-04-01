import java.util.*;
import java.util.regex.*;

public class TrainValidationApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step 1: Input from user
        System.out.print("Enter Train ID (format: TRN-1234): ");
        String trainId = sc.nextLine();

        System.out.print("Enter Cargo Code (format: PET-AB): ");
        String cargoCode = sc.nextLine();

        // Step 2: Define regex patterns
        String trainRegex = "TRN-\\d{4}";
        String cargoRegex = "PET-[A-Z]{2}";

        // Step 3: Compile patterns
        Pattern trainPattern = Pattern.compile(trainRegex);
        Pattern cargoPattern = Pattern.compile(cargoRegex);

        // Step 4: Create matchers
        Matcher trainMatcher = trainPattern.matcher(trainId);
        Matcher cargoMatcher = cargoPattern.matcher(cargoCode);

        // Step 5: Validate using matches()
        boolean isTrainValid = trainMatcher.matches();
        boolean isCargoValid = cargoMatcher.matches();

        // Step 6: Display results
        if (isTrainValid) {
            System.out.println("Train ID is VALID");
        } else {
            System.out.println("Train ID is INVALID");
        }

        if (isCargoValid) {
            System.out.println("Cargo Code is VALID");
        } else {
            System.out.println("Cargo Code is INVALID");
        }

        sc.close();
    }
}