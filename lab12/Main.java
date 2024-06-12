package lab12;


public class Main {

    public static void main(String[] args) {
        CarFleet fleet = new CarFleet();
        Car electricCar = new ElectricCar(40);
        Car gasolineCar = new GasolineCar(80);

        fleet.addCar(electricCar);
        fleet.addCar(gasolineCar);

        fleet.startCar(0);
        fleet.startCar(1);


        fleet.getAllCars();
    }
}
