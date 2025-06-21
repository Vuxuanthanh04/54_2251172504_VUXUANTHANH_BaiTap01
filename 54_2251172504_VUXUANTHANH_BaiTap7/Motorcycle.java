public class Motorcycle implements Vehicle {

    @Override
    public int getMaxSpeed() {
        return 120;
    }

    @Override
    public String getColor() {
        return "Black";
    }

    @Override
    public String getModal() { 
        return "Yamaha R15";
    }
}
