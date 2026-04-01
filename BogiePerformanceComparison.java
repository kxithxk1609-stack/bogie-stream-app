import java.util.*;
import java.util.stream.*;

class Bogie {
    String type;
    String cargo;

    public Bogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    public String getType() {
        return type;
    }

    public String getCargo() {
        return cargo;
    }
}

public class BogiePerformanceComparison {

    public static void main(String[] args) {

        // Step 1: Create large collection for testing
        List<Bogie> bogies = new ArrayList<>();

        for (int i = 0; i < 100000; i++) {
            if (i % 2 == 0) {
                bogies.add(new Bogie("Cylindrical", "Petroleum"));
            } else {
                bogies.add(new Bogie("Box", "Coal"));
            }
        }

        // 🔁 LOOP-BASED FILTERING
        long startLoop = System.nanoTime();

        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.getType().equalsIgnoreCase("Cylindrical")) {
                loopResult.add(b);
            }
        }

        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;

        // ⚡ STREAM-BASED FILTERING
        long startStream = System.nanoTime();

        List<Bogie> streamResult = bogies.stream()
                .filter(b -> b.getType().equalsIgnoreCase("Cylindrical"))
                .collect(Collectors.toList());

        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;

        // 📊 Display Results
        System.out.println("Loop Time (ns): " + loopTime);
        System.out.println("Stream Time (ns): " + streamTime);

        // ✅ Optional comparison
        if (loopTime < streamTime) {
            System.out.println("Loop is faster");
        } else {
            System.out.println("Stream is faster");
        }
    }
}