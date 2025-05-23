public class Car {
    private int seats;
    private String engine;
    private boolean hasTripComputer;
    private boolean hasGPS;

    public void setSeats(int seats) { this.seats = seats; }
    public void setEngine(String engine) { this.engine = engine; }
    public void setTripComputer(boolean value) { this.hasTripComputer = value; }
    public void setGPS(boolean value) { this.hasGPS = value; }

    public String toString() {
        return "Car: " + seats + " seats, Engine: " + engine +
               ", TripComputer: " + hasTripComputer + ", GPS: " + hasGPS;
    }
}
