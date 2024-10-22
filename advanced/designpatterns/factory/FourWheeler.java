package advanced.designpatterns.factory;

/**
 * Concrete product classes representing different types of vehicles,
 * implementing the printVehicle() method.
 */

public class FourWheeler extends Vehicle {
    public void printVehicle() {
        System.out.println("I am the four wheeler vehicle");
    }
}
