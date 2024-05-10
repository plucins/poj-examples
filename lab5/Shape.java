package lab5;

public class Shape {
    protected int a;
    protected int b;

    protected String name;

    public Shape(int a) {
        this.a = a;
    }

    public Shape(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public String getName(){
        return name;
    }

    public int area(){
        return a*b;
    }

    public int perimeter(){
        return a+b;
    }
}
