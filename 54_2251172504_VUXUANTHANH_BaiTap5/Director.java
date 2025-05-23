public class Director {
    public void makeSUV(Builder builder) {
        builder.reset();
        builder.setSeats(6);
        builder.setEngine("V6");
        builder.setTripComputer();
        builder.setGPS();
    }

    public void makeSportsCar(Builder builder) {
        builder.reset();
        builder.setSeats(2);
        builder.setEngine("V8 Turbo");
        builder.setTripComputer();
        builder.setGPS();
    }
}
