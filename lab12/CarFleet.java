package lab12;

import java.util.ArrayList;
import java.util.List;

public class CarFleet {
    private List<Car> cars;

    public CarFleet() {
        this.cars = new ArrayList<>();
    }

    public void addCar(Car c){
        cars.add(c);
    }

    public void startCar(int carIndex){
        if(carIndex >= 0 && carIndex < cars.size()){
            cars.get(carIndex).start();
        }else {
            System.out.println("Błędny index");
        }
    }

    public void stopCar(int carIndex){
        if(carIndex >= 0 && carIndex < cars.size()){
            cars.get(carIndex).stop();
        }else {
            System.out.println("Błędny index");
        }
    }

    public void refuelCar(int carIndex, double amout) {
        if(carIndex >= 0 && carIndex < cars.size()){
            Car c = cars.get(carIndex);
            if(c instanceof GasolineCar){
                ((GasolineCar) c).fuelRefill(amout);
            }else{
                System.out.println("Ten samochod nie jest spalinowy");
            }
        }else {
            System.out.println("Błędny index");
        }
    }

    public void getAllCars(){
        for(Car c: cars){
            System.out.println(c.getCarType() + " | " + c.getFuelLevel());
        }
    }



}
