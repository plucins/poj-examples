package lab9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Box<String> boxString = new Box<>("asd");
        Box<Integer> boxInt = new Box<>(1);
        Box<Double> boxDouble = new Box<>(1.1);

        List<Number> asd = new ArrayList();
        asd.add(1);
        asd.add(1.1);

        Map<Long, String> a = new HashMap<>();
    }
}
