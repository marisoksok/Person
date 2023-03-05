package inheritance;

public class Main
{
    public static void main(String[] args) {
        Car car = new Car("Ford", "ERE345",1999,true);
        car.go();
        System.out.println(car.toString());
        System.out.println(car.getBrand()+"  "+car.getLicencePlate());
        Bicycle bike= new Bicycle("pinky");
        bike.go();
        System.out.println(bike.toString());
        Bicycle bike1= (Bicycle) new Vehicle();
        System.out.println();
    }


}
