public class Rectangle extends Shape {

    public Rectangle(int a, int b) {
        super(a, b);
        this.name = "Prostokat";
    }

    @Override
    public int area() {
        return a * b;
    }

    @Override
    public int perimeter() {
        return 2 * a + 2 * b;
    }
}
