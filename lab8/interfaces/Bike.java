package lab8.interfaces;

public class Bike implements Movable{
    int position = 0;

    @Override
    public void move(int amount) {
        this.position += amount;
        System.out.println("Przejechalem rowerem na pozycje: " + this.position);
    }
}
