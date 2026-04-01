// Custom Exception Class
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

// Passenger Bogie Class
class PassengerBogie {
    private int capacity;

    // Constructor with validation
    public PassengerBogie(int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than 0!");
        }
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}

// Main Application
public class PassengerBogieApp {

    public static void main(String[] args) {

        try {
            // ✅ Valid bogie
            PassengerBogie b1 = new PassengerBogie(72);
            System.out.println("Passenger Bogie created with capacity: " + b1.getCapacity());

            // ❌ Invalid bogie (will throw exception)
            PassengerBogie b2 = new PassengerBogie(0);
            System.out.println("Passenger Bogie created with capacity: " + b2.getCapacity());

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Program continues safely...");
    }
}