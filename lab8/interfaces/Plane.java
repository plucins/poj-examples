package lab8.interfaces;

public class Plane implements Movable, Loud {

    int position = 0;

    @Override
    public void move(int amount) {
        this.position += 4*amount;
        System.out.println("Przelecialem samolotem na pozycje: " + this.position);
    }

    @Override
    public String defaultMethod() {
        return "Lece samolotem";
    }

    @Override
    public void makeSound() {
        System.out.println("Fruuuu.....");
    }
}
