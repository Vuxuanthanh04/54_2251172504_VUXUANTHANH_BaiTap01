public class VehicleAdapter implements VehicleInterface {
    private Vehicle adaptee;
    private VehicleService service;

    public VehicleAdapter(Vehicle adaptee, VehicleService service) {
        this.adaptee = adaptee;
        this.service = service;
    }

    @Override
    public int getMaxSpeed() {
        return adaptee.getMaxSpeed();
    }

    @Override
    public String getColor() {
        return service.getColor();
    }
}
