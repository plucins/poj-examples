package lab8.interfaces;

public class Train implements Movable{
    int position = 0;
    @Override
    public void move(int amount) {
        this.position += 3*amount;
        System.out.println("Przejechalem samochodem na pozycje: " + this.position);
    }
}
