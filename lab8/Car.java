package lab8;

public class Car implements Comparable {
    private int yearOfProduction;

    public Car(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public int compareTo(Object o) {
        Car secondCar = (Car) o;
        return this.yearOfProduction - secondCar.yearOfProduction;
    }

    @Override
    public String toString() {
        return "Car{" +
                "yearOfProduction=" + yearOfProduction +
                '}';
    }
}
