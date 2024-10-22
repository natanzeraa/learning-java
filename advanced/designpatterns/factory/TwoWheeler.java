package advanced.designpatterns.factory;

/**
 * Concrete product classes representing different types of vehicles,
 * implementing the printVehicle() method.
 */

public class TwoWheeler extends Vehicle {
    public void printVehicle() {
        System.out.println("I am the two wheeler vehicle");
    }
}
