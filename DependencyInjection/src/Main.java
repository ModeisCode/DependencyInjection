public class Main {
    public static void main(String[] args) {
        Engine engine = new GasolineEngine();
        Car car = new AutoCar(engine);
        car.drive();
    }
}