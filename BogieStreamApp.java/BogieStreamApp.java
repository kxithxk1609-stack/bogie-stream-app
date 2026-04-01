import java.util.*;

class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}

public class BogieStreamApp {

    public static void main(String[] args) {

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Cargo", 100));

        System.out.println("Bogies with capacity greater than 50:\n");

        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.capacity > 50)
                .toList();

        filteredBogies.forEach(b ->
                System.out.println(b.name + " - Capacity: " + b.capacity)
        );
    }
}