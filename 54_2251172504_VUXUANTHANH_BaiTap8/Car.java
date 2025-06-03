public class Car extends Vehicle {
    private Mediator mediator;

    public Car(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public int getMaxSpeed() {
        return 200;
    }

    public void doSomething() {
        mediator.notify(this);
    }
}
