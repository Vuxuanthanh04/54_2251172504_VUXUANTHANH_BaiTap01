public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder carBuilder = new CarBuilder();
        director.makeSportsCar(carBuilder);
        Car car = carBuilder.getResult();
        System.out.println(car);

        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.makeSportsCar(manualBuilder);
        Manual manual = manualBuilder.getResult();
        System.out.println(manual);
    }
}
