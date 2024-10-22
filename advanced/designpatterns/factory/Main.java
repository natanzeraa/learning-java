package advanced.designpatterns.factory;

/**
 * The Factory Method Design Pattern is a creational design pattern used in
 * software development. It provides an interface for creating objects in a
 * superclass while allowing subclasses to specify the types of objects they
 * create.
 */

public class Main {
    public static void main(String[] args) {
        VehicleFactory twoWheelerFactory = new TwoWheelerFactory();
        Client twoWheelerClient = new Client(twoWheelerFactory);
        Vehicle twoWheeler = twoWheelerClient.getVehicle();
        twoWheeler.printVehicle();

        VehicleFactory fourWheelerFactory = new FourWheelerFactory();
        Client fourWheelerClient = new Client(fourWheelerFactory);
        Vehicle fourWheeler = fourWheelerClient.getVehicle();
        fourWheeler.printVehicle();
    }

}
