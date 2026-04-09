import java.util.Arrays;

public class BogieTypeSort {

    public static void main(String[] args) {

        // Step 1: Create array of bogie type names
        String[] bogieTypes = {"Cylindrical", "Box", "Flatbed", "Tanker", "Open"};

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(bogieTypes));

        // Step 2: Use Arrays.sort() (built-in method)
        Arrays.sort(bogieTypes);

        // Step 3: Display sorted result
        System.out.println("\nAfter Sorting:");
        System.out.println(Arrays.toString(bogieTypes));

        System.out.println("\nProgram continues...");
    }
}