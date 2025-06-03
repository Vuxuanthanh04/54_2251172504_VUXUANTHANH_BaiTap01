public class MediatorVehicle implements Mediator {
    private Car car;
    private Bicycle bicycle;

    public void setCar(Car car) {
        this.car = car;
    }

    public void setBicycle(Bicycle bicycle) {
        this.bicycle = bicycle;
    }

    @Override
    public void notify(Vehicle sender) {
        if (sender == car) {
            reactOnCar();
        } else if (sender == bicycle) {
            reactOnBicycle();
        }
    }

    private void reactOnCar() {
        System.out.println("Mediator phản ứng với Car");
    }

    private void reactOnBicycle() {
        System.out.println("Mediator phản ứng với Bicycle");
    }
}
