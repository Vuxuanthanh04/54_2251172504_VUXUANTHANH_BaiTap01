public class Bicycle extends Vehicle {
    private Mediator mediator;

    public Bicycle(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public int getMaxSpeed() {
        return 30;
    }

    public void doSomething() {
        mediator.notify(this);
    }
}
