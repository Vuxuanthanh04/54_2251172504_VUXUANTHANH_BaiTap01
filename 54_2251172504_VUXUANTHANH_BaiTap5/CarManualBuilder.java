public class CarManualBuilder implements Builder {
    private StringBuilder manualContent;

    public CarManualBuilder() {
        this.reset();
    }

    public void reset() {
        manualContent = new StringBuilder("Manual:\n");
    }

    public void setSeats(int number) {
        manualContent.append("Seats: ").append(number).append("\n");
    }

    public void setEngine(String engine) {
        manualContent.append("Engine: ").append(engine).append("\n");
    }

    public void setTripComputer() {
        manualContent.append("Includes Trip Computer\n");
    }

    public void setGPS() {
        manualContent.append("Includes GPS\n");
    }

    public Manual getResult() {
        return new Manual(manualContent.toString());
    }
}
