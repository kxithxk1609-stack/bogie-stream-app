import java.util.Arrays;
import java.util.Scanner;

public class BogieBinarySearch {

    public static void main(String[] args) {

        // Step 1: Create sorted array of bogie IDs
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG523"};

        // (Optional) Ensure sorting (safety step)
        Arrays.sort(bogieIds);

        // Step 2: Take input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Bogie ID to search: ");
        String key = sc.nextLine();

        // Step 3: Initialize low and high
        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        // Step 4: Binary Search
        while (low <= high) {

            int mid = (low + high) / 2;

            int comparison = key.compareTo(bogieIds[mid]);

            if (comparison == 0) {
                System.out.println("✅ Bogie found at position: " + mid);
                found = true;
                break;
            } else if (comparison > 0) {
                low = mid + 1; // search right half
            } else {
                high = mid - 1; // search left half
            }
        }

        // Step 5: If not found
        if (!found) {
            System.out.println("❌ Bogie not found");
        }

        System.out.println("Program continues...");
        sc.close();
    }
}