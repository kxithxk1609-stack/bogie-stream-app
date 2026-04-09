import java.util.Scanner;

public class BogieLinearSearch {

    public static void main(String[] args) {

        // Step 1: Create array of bogie IDs (unsorted)
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG523"};

        // Step 2: Take search input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Bogie ID to search: ");
        String key = sc.nextLine();

        // Step 3: Linear Search
        boolean found = false;

        for (int i = 0; i < bogieIds.length; i++) {

            // Step 4: Compare using equals()
            if (bogieIds[i].equals(key)) {
                found = true;
                System.out.println("✅ Bogie found at position: " + i);
                break; // Step 5: Early termination
            }
        }

        // Step 6: Display result if not found
        if (!found) {
            System.out.println("❌ Bogie not found");
        }

        System.out.println("Program continues...");
        sc.close();
    }
}