import java.util.*;

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

public class TrainSafetyCheck {

    public static void main(String[] args) {

        // Create list of goods bogies
        List<Bogie> bogies = Arrays.asList(
                new Bogie("Cylindrical", "Petroleum"),
                new Bogie("Box", "Coal"),
                new Bogie("Flatbed", "Steel"),
                new Bogie("Cylindrical", "Petroleum")
        );

        // Validate using Stream + allMatch()
        boolean isSafe = bogies.stream()
                .allMatch(bogie -> {
                    if (bogie.getType().equalsIgnoreCase("Cylindrical")) {
                        return bogie.getCargo().equalsIgnoreCase("Petroleum");
                    }
                    return true;
                });

        // Display result
        if (isSafe) {
            System.out.println("Train is SAFETY COMPLIANT");
        } else {
            System.out.println("Train is NOT SAFE");
        }
    }
}