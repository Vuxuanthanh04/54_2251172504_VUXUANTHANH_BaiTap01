public class CarBuilder implements Builder {
    private Car car;

    public CarBuilder() {
        this.reset();
    }

    public void reset() {
        car = new Car();
    }

    public void setSeats(int number) {
        car.setSeats(number);
    }

    public void setEngine(String engine) {
        car.setEngine(engine);
    }

    public void setTripComputer() {
        car.setTripComputer(true);
    }

    public void setGPS() {
        car.setGPS(true);
    }

    public Car getResult() {
        return car;
    }
}
