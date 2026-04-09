import java.util.*;

public class EmptyTrainSearchCheck {

    public static void main(String[] args) {

        // Step 1: Create bogie collection (try empty first)
        List<String> bogieIds = new ArrayList<>();

        // Uncomment below to test valid case
        // bogieIds.add("BG101");
        // bogieIds.add("BG205");

        String searchKey = "BG101";

        try {
            // Step 2: Defensive check (Fail-Fast)
            if (bogieIds.isEmpty()) {
                throw new IllegalStateException("❌ Cannot perform search: Train has no bogies.");
            }

            // Step 3: Perform search (Linear Search)
            boolean found = false;

            for (String id : bogieIds) {
                if (id.equals(searchKey)) {
                    System.out.println("✅ Bogie found: " + id);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("❌ Bogie not found");
            }

        } catch (IllegalStateException e) {
            // Step 4: Handle exception gracefully
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Program continues safely...");
    }
}