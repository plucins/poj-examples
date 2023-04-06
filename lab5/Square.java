public class Square extends Shape {

    public Square(int a) {
        super(a);
        this.name = "Kwadrat";
    }

    @Override
    public int area() {
        return a*a;
    }

    @Override
    public int perimeter() {
        return a*4;
    }
}
