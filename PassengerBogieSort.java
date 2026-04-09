public class PassengerBogieSort {

    public static void main(String[] args) {

        // Step 1: Create array of passenger bogie capacities
        int[] capacities = {72, 45, 90, 60, 30};

        System.out.println("Before Sorting:");
        printArray(capacities);

        // Step 2: Bubble Sort Algorithm
        int n = capacities.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                // Step 3: Compare adjacent elements
                if (capacities[j] > capacities[j + 1]) {

                    // Step 4: Swap
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        // Step 5: Display sorted result
        System.out.println("\nAfter Sorting:");
        printArray(capacities);

        System.out.println("\nProgram continues...");
    }

    // Helper method to print array
    public static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}