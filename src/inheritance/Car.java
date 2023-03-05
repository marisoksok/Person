package inheritance;

import java.sql.SQLOutput;

public class Car extends Vehicle{
    int wheels=4;
    int maxPassengers=5;
    int year;
    boolean ITV;

    Car(){
        System.out.printf("Default from Car");
    }

    Car(String brand, String licencePlate, int year, boolean ITV){
        super(brand,licencePlate);
        this.year=year;
        this.ITV=ITV;
    }

    public int getWheels() {
        return wheels;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
