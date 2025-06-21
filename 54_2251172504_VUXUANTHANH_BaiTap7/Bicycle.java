public class Bicycle implements Vehicle {
    @Override
    public int getMaxSpeed() {
        return 30;
    }

    @Override
    public String getColor() {
        return "Blue";
    }

    @Override
    public String getModal() {
        return "Mountain Bike";
    }
}
