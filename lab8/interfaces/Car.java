package lab8.interfaces;

public class Car implements Movable, Loud{

    int position = 0;

    @Override
    public void move(int amount) {
        this.position += 2*amount;
        System.out.println("Przejechalem samochodem na pozycje: " + this.position);
    }

    @Override
    public void makeSound() {
        System.out.println("Jadeee....");
    }
}
