package lab5;

public class Square extends Shape {
    public Square(int a) {
        super(a);
        this.name = "Kwadrat";
    }
    @Override
    public int area(){
        return a*a;
    }

    public int perimeter(){
        return a*4;
    }


}
