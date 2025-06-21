public class Car implements Vehicle {
    @Override
    public int getMaxSpeed() {
        return 200;
    }

    @Override
    public String getColor() {
        return "Red";
    }

    @Override
    public String getModal() {
        return "Sedan";
    }
}
