package lab5;

public class Triangle extends Shape{
    private int c;
    private int h;

    public Triangle(int a, int b, int c, int h) {
        super(a, b);
        this.c = c;
        this.h = h;
        this.name = "Trójkąt";
    }
    @Override
    public int area(){
        return (a*h)/2;
    }

    public int perimeter(){
        return a+b+c;
    }

}
