package lab12;


public class GasolineCar implements Car {
    private double fuelLevel;
    private boolean isRunning;

    public GasolineCar(double fuelLevel) {
        this.fuelLevel = fuelLevel;
        this.isRunning = false;

    }

    @Override
    public void start() {
        if (fuelLevel > 0 ){
            isRunning = true;
            System.out.println("Uruchomilem samochod spalinowy");
        }
        else {
            System.out.println("Nie ma paliwa!");
        }
    }

    @Override
    public void stop() {
        isRunning = false;
        System.out.println("Samochod spalinowy wyłączony");

    }

    @Override
    public double getFuelLevel() {
        return fuelLevel;
    }

    @Override
    public String getCarType() {
        return "Samochomd spalinowy";
    }

    public void fuelRefill(double amout){
        fuelLevel += amout;
        System.out.println("Tankuje spalinowy");
    }
}
