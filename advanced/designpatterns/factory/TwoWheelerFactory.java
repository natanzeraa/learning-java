package advanced.designpatterns.factory;

/**
 * Concrete creator classes (Concrete Factories) implementing the VehicleFactory
 * interface to create instances of specific types of vehicles.
 */

public class TwoWheelerFactory implements VehicleFactory {
    public Vehicle createVehicle() {
        return new TwoWheeler();
    }
}
