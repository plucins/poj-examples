package lab8;

import java.util.Arrays;

public class CarMain {
    public static void main(String[] args) {
        Car bmw = new Car(2020);
        Car opel = new Car(2019);
        Car ford = new Car(2022);

        Car[] carTab = {bmw, opel, ford};

        System.out.println(Arrays.toString(carTab));
        Arrays.sort(carTab);
        System.out.println(Arrays.toString(carTab));
    }
}
