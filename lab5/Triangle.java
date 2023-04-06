public class Triangle extends Shape {
    private int c;
    private int h;

    public Triangle(int a, int b, int c, int h) {
        super(a, b);
        this.c = c;
        this.h = h;
        this.name = "Trojkat";
    }

    @Override
    public int area() {
        return a * h / 2;
    }

    @Override
    public int perimeter() {
        return a + b + c;
    }
}
