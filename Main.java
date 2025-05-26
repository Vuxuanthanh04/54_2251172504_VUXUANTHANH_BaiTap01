public class Main {
    public static void main(String[] args) {
        // Khởi tạo Car và Bicycle
        Vehicle car = new Car();
        Vehicle bicycle = new Bicycle();

        // Dịch vụ đi kèm để lấy màu
        VehicleService carService = new CarService();
        VehicleService bicycleService = new BicycleService();

        // Adapter chuyển đổi thành VehicleInterface
        VehicleInterface[] vehicles = new VehicleInterface[2];
        vehicles[0] = new VehicleAdapter(car, carService);
        vehicles[1] = new VehicleAdapter(bicycle, bicycleService);

        // In ra thông tin
        for (VehicleInterface v : vehicles) {
            System.out.println("Max Speed: " + v.getMaxSpeed() + " km/h");
            System.out.println("Color: " + v.getColor());
            System.out.println("------");
        }
    }
}
