package inheritance;

public class Vehicle {
    double speed;
    String brand;
    String licencePlate;

    Vehicle(){
        System.out.println("Default constructor from Vehicle class");
    }


    Vehicle(String brand, String licencePlate){
        this.brand=brand;
        this.licencePlate=licencePlate;



    }

    public Vehicle(String licencePlate) {
        this.licencePlate = licencePlate;
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public String getBrand() {
        return brand;
    }
    void go(){
        System.out.println("This vehicle is moving");
    }
    void stop(){
        System.out.println("This vehicle is stopped");
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "speed=" + speed +
                ", brand='" + brand + '\'' +
                ", licencePlate='" + licencePlate + '\'' +
                '}';
    }
}
