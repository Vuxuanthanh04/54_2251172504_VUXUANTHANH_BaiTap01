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

      
        Vehicle moto = new Motorcycle();
        VehicleManager motoManager = new VehicleManager(moto);

            System.out.println("Modal: " + motoManager.getModal());
            System.out.println("Color: " + motoManager.getColor());
            System.out.println("Max Speed: " + motoManager.getMaxSpeed() + " km/h");
            System.out.println("---------------");


    }
}
