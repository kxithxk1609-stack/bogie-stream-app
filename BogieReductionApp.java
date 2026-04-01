import java.util.*;

public class BogieReductionApp {

    public static void main(String[] args) {

        // Step 1: Create list
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Cargo", 100));

        // Step 2: Stream → map → reduce
        int totalCapacity = bogies.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        // Step 3: Display result
        System.out.println("Total Seating Capacity: " + totalCapacity);
    }
}