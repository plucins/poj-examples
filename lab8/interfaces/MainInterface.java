package lab8.interfaces;

public class MainInterface {
    public static void main(String[] args) {
        Movable[] tab = {new Bike(), new Car(), new Plane(), new Train()};
        Loud[] tab1 = {new Plane(), new Car()};

//        for(Movable movable: tab){
//            movable.move(5);
//        }

        for(Movable movable: tab){
            System.out.println(movable.defaultMethod());
        }
    }
}
