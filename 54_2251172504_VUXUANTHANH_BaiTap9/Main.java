public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[2];
        vehicles[0] = new Vehicle(new CarSpeed());
        vehicles[1] = new Vehicle(new BicycleSpeed());

        for (Vehicle v : vehicles) {
            System.out.println("Tốc độ tối đa: " + v.getMaxSpeed() + " km/h");
        }
    }
}
