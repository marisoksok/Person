package inheritance;

public class Bicycle extends Vehicle {
    int pedals=2;
    int wheels=2;
    int maxPassengers=2;
    String color;


    public Bicycle() {
    }

    public Bicycle(String brand, String licencePlate) {
        super("Seat", licencePlate);
    }

    public Bicycle(String color) {
        this.color = color;

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
