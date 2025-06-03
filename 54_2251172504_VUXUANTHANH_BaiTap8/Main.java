public class Main {
    public static void main(String[] args) {
        MediatorVehicle mediator = new MediatorVehicle();

        Car car = new Car(mediator);
        Bicycle bicycle = new Bicycle(mediator);

        mediator.setCar(car);
        mediator.setBicycle(bicycle);

        // Kiểm tra nguyên lý LSP với mảng Vehicle
        Vehicle[] vehicles = {car, bicycle};
        for (Vehicle v : vehicles) {
            System.out.println("Tốc độ tối đa: " + v.getMaxSpeed());
        }

        // Gọi hành động để test mediator
        car.doSomething();
        bicycle.doSomething();
    }
}
