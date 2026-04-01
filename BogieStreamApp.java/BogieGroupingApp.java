import java.util.*;
import java.util.stream.*;

class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " (" + capacity + ")";
    }
}

public class BogieGroupingApp {

    public static void main(String[] args) {

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("Sleeper", 80));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("AC Chair", 55));
        bogies.add(new Bogie("Cargo", 100));

        Map<String, List<Bogie>> grouped =
                bogies.stream()
                      .collect(Collectors.groupingBy(b -> b.name));

        System.out.println("Grouped Bogies:\n");

        grouped.forEach((key, value) -> {
            System.out.println(key + ":");
            value.forEach(b -> System.out.println("  " + b));
        });
    }
}