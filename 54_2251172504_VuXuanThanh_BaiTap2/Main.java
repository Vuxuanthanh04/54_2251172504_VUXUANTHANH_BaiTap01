public class Main {
    public static void main(String[] args) {
        // Tạo mảng Vehicle chứa cả Car và Bicycle
        Vehicle[] vehicles = new Vehicle[] {
            new Car(),
            new Bicycle()
        };

        // In tốc độ tối đa của từng phương tiện
        for (Vehicle vehicle : vehicles) {
            System.out.println("Tốc độ tối đa: " + vehicle.getMaxSpeed() + " km/h");
        }
    }
}