public class Main {
    public static void main(String[] args) {
        VehicleFactory carFactory = new CarFactory();
        VehicleFactory bicycleFactory = new BicycleFactory();

        Vehicle[] vehicles = new Vehicle[] {
            carFactory.createVehicle(),
            bicycleFactory.createVehicle()
        };

        for (Vehicle v : vehicles) {
            System.out.println("Tốc độ tối đa: " + v.getMaxSpeed() + " km/h");
        }
    }
}
