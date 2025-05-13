// Lớp Main để thể hiện mẫu Factory Method
public class Main {
    public static void main(String[] args) {
        // Tạo các factory
        VehicleFactory[] factories = new VehicleFactory[] {
            new CarFactory(),
            new BicycleFactory()
        };

        // Tạo các phương tiện bằng factory và lưu vào mảng
        Vehicle[] vehicles = new Vehicle[factories.length];
        for (int i = 0; i < factories.length; i++) {
            vehicles[i] = factories[i].createVehicle();
        }

        // In tốc độ tối đa của từng phương tiện
        for (Vehicle vehicle : vehicles) {
            System.out.println("Tốc độ tối đa: " + vehicle.getMaxSpeed() + " km/h");
        }
    }
}