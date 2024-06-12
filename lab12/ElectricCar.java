package lab12;


public class ElectricCar implements Car {
    private double batteryLevel;
    private boolean isRunning;

    public ElectricCar(double batteryLevel) {
        this.batteryLevel = batteryLevel;
        this.isRunning = false;
    }

    @Override
    public void start() {
        if(batteryLevel > 0) {
            isRunning = true;
            System.out.println("Pojazd uruchomiony");
        }else {
            System.out.println("Bateria rozładowana, nie mogę uruchomić");
        }

    }

    @Override
    public void stop() {
        isRunning = false;
        System.out.println("Samochód wyłączony");

    }

    @Override
    public double getFuelLevel() {
        return batteryLevel;
    }

    @Override
    public String getCarType() {
        return "Samochód elektryczny";
    }

    public void charge(double amount){
        batteryLevel =+ amount;
        System.out.println("Nadałowałem o " + amount);
    }
}
