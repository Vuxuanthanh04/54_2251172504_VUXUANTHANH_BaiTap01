public class BicycleFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Bicycle();
    }
}
