// VehicleManager.java (Abstraction)
public class VehicleManager {
    protected Vehicle vehicle;

    public VehicleManager(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public int getMaxSpeed() {
        return vehicle.getMaxSpeed();
    }

    public String getColor() {
        return vehicle.getColor();
    }

    public String getModal() {
        return vehicle.getModal();
    }
}
