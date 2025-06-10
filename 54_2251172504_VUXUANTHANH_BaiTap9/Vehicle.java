public class Vehicle {
    private SpeedStrategy speedStrategy;

    public Vehicle(SpeedStrategy speedStrategy) {
        this.speedStrategy = speedStrategy;
    }

    public void setSpeedStrategy(SpeedStrategy speedStrategy) {
        this.speedStrategy = speedStrategy;
    }

    public int getMaxSpeed() {
        return speedStrategy.getMaxSpeed();
    }
}
