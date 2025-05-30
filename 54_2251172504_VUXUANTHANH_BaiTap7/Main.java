// Main.java (Client)
public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Car(),
            new Bicycle()
        };

        for (Vehicle v : vehicles) {
            VehicleManager manager = new VehicleManager(v);
            System.out.println("Modal: " + manager.getModal());
            System.out.println("Color: " + manager.getColor());
            System.out.println("Max Speed: " + manager.getMaxSpeed() + " km/h");
            System.out.println("---------------");
        }
    }
}
